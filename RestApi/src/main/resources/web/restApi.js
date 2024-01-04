const tableHeaders = new Array("Imię", "Nazwisko", "Specjalizacja", "Numer klasy", "Adres e-mail", "Edycja", "Usuwanie");
const jsonProperties = new Array('name', 'surname', 'speciality', 'classNumber', 'email');
const hateoasMap = new Map();
const restEndpointLink = "http://localhost:8080/api/students";
let editFlag = false;
let editButtonId = "";
let hateoas = "";

document.addEventListener("DOMContentLoaded", () => {
    var form = document.getElementById('add');
    form.addEventListener('submit', (ev) => {
        ev.preventDefault();
        let data = new FormData(ev.target);
        let jsonStudent = Object.fromEntries(data.entries());
        let jsonEmail = {};
        jsonEmail.email = jsonStudent.email;
        jsonStudent.email = jsonEmail;
        var response = postData("http://localhost:8080/api/students", jsonStudent).then(response => { console.log(response) });
        if (response != undefined || response != null) {
            form.reset();
            response.then(data => {
                getData(restEndpointLink);
            });
        }

    });
    var allStudentsButton = document.getElementById('allStudents');
    allStudentsButton.addEventListener('click', (ev => {
        getData(restEndpointLink);
    }));
});

/**
 * Metoda wysyłająca żądanie typu POST na endpoint REST-a (dodawanie Studenta)
 * @param {string} url 
 * @param {JSON} json 
 * @returns {Promise}
 */
async function postData(url, json) {
    const response = await fetch(url, {
        method: "POST",
        mode: "cors",
        cache: "default",
        credentials: "same-origin",
        headers: new Headers({ 'content-type': 'application/json' }),
        redirect: "follow",
        referrerPolicy: "no-referrer",
        body: JSON.stringify(json)
    });
    return response.json();
}

/**
 * Metoda wysyłająca żądanie typu GET na endpoint REST-a(pobieranie listy studentów i rendering tabeli)
 * @param {string} url 
 */
async function getData(url) {
    const response = await fetch(url)
        .then((r) => r.json())
        .then((data) => {
            var div = document.getElementById('studentsContainer');
            if (data._embedded == undefined) {
                var oldTable = document.getElementById('students');
                if (oldTable != undefined) {
                    div.removeChild(oldTable);
                }
                return;
            }
            var table = document.createElement('table');
            table.setAttribute('id', 'students')
            table.classList.add('table');
            table.classList.add('table-fit');
            table.classList.add('table-dark');
            table.classList.add('table-striped');
            table.classList.add('mt-5');
            var tableHeader = document.createElement('thead');
            var headerRow = document.createElement('tr');
            for (var header of tableHeaders) {
                var th = document.createElement("th");
                th.innerHTML = header;
                headerRow.appendChild(th);
            }
            var tableBody = document.createElement('tbody');
            const students = data._embedded.students;
            var id = 1;
            for (var student of students) {
                var dataRow = document.createElement('tr');
                for (var prop in student) {
                    switch (prop) {
                        case 'classNumber':
                        case 'speciality':
                        case 'surname':
                        case 'name': {
                            var td = document.createElement('td');
                            td.setAttribute('id', prop + '#' + id);
                            td.innerHTML = student[prop];
                            dataRow.appendChild(td);
                            break;
                        }
                        case 'email': {
                            var td = document.createElement('td');
                            td.setAttribute('id', prop + '#' + id);
                            td.innerHTML = student[prop][prop];
                            dataRow.appendChild(td);
                            break;
                        }
                    }



                }
                var classes = new Array('btn', 'btn-danger', 'm-3')
                createButton(dataRow, studentEdit, classes, id, 'Edytuj');
                createButton(dataRow, studentDelete, classes, id, 'Usuń');
                tableBody.append(dataRow);
                hateoasMap.set(id, student._links.self.href);
                id++;
            }
            tableHeader.appendChild(headerRow)
            table.appendChild(tableHeader);
            table.appendChild(tableBody);
            var oldTable = document.getElementById('students');
            if (oldTable != undefined) {
                div.removeChild(oldTable);
                div.appendChild(table);
            } else {
                div.appendChild(table);
            }
        });

}
/**
 * Metoda obsługująca klik przycisku od edycji
 * @param {Event} event 
 */
function studentEdit(event) {
    var button = event.target;
    if (!editFlag) {
        editFlag = true;
        editButtonId = button.id;
        button.innerHTML = 'Zapisz';
        button.classList.remove('btn-danger');
        button.classList.add('btn-warning');
        let id = editButtonId.split('#').pop();
        for (var i = 0; i < jsonProperties.length; i++) {
            var element = document.getElementById(jsonProperties[i] + '#' + id);
            var editInput = document.createElement('input');
            if (jsonProperties === 'email') {
                editInput.setAttribute('type', 'email');
            } else if (jsonProperties === 'classNumber') {
                editInput.setAttribute('type', 'number');
            } else {
                editInput.setAttribute('type', 'text');
            }

            editInput.classList.add('form-control');
            editInput.value = element.innerHTML;
            element.innerHTML = '';
            element.appendChild(editInput);
        }

    } else {
        if (editButtonId == button.id) {
            let id = editButtonId.split('#').pop();
            let requestlink = hateoasMap.get(parseInt(id));
            var jsonStudent = {};
            for (var property of jsonProperties) {
                element = document.getElementById(property + '#' + id);
                var cache = element.firstChild.value;
                if (property === 'email') {
                    var jsonEmail = {};
                    jsonEmail[property] = cache;
                    jsonStudent[property] = jsonEmail;
                } else {
                    jsonStudent[property] = cache;
                }

                element.innerHTML = cache;
            }
            const response = putData(requestlink, jsonStudent).then(data => console.log(data));
            button.innerHTML = 'Edytuj';
            button.classList.remove('btn-warning');
            button.classList.add('btn-danger');
            editFlag = false;
            if (response != undefined || response != null) {
                response.then(data => {
                    getData(restEndpointLink);
                });
            } else {
                alert("Błąd! Nie udało się dodać studenta, sprawdź logi w konsoli");
                getData(restEndpointLink);
            }
        } else {
            alert('Błąd! Zakończ edycję studenta zanim rozpoczniesz edycję kolejnego');
        }

    }

}
/**
 * Metoda wysyłająca żądanie typu PUT na endpoint REST-a(update Studenta)
 * @param {string} url 
 * @param {JSON} json 
 * @returns 
 */
async function putData(url, json) {
    const response = await fetch(url, {
        method: "PUT",
        mode: "cors",
        cache: "default",
        credentials: "same-origin",
        headers: new Headers({ 'content-type': 'application/json' }),
        redirect: "follow",
        referrerPolicy: "no-referrer",
        body: JSON.stringify(json)
    });
    return response.json();
}
/**
 * Metoda tworząca przycisk z odpowiednim listenerem i css-ami
 * @param {Node} node 
 * @param {Function} command 
 * @param {Array} nodeClasses
 * @param {string} id 
 */
function createButton(node, command, nodeClasses, id, commandName) {
    var td = document.createElement('td');
    var button = document.createElement('button');
    button.innerHTML = commandName;
    button.setAttribute('type', 'button');
    for (var clazz of nodeClasses) {
        button.classList.add(clazz);
    }
    button.setAttribute('id', 'edit' + '#' + id);
    button.addEventListener('click', command);
    td.appendChild(button);
    node.appendChild(td);
}
/**
 * Metoda usuwająca studenta
 * @param {Event} event 
 */
function studentDelete(event) {
    var url = hateoasMap.get(parseInt(event.target.id.split("#").pop()));
    deleteData(url)
        .then(response => response.json)
        .then(data => getData(restEndpointLink));
}
/**
 * Metoda wysyłająca żądanie typu DELETE na endpoint REST-a
 * @param {string} url 
 */
async function deleteData(url) {
    const response = await fetch(url, {
        method: "DELETE",
        mode: "cors",
        cache: "default",
        credentials: "same-origin",
        headers: new Headers({ 'content-type': 'application/json' }),
        redirect: "follow",
        referrerPolicy: "no-referrer"
    });
    return response;
}

/**
 * Metoda ustawiająca widok portretowy dla studenta i obsługująca klik na wierszu
 * tabeli
 * @param {Event} event 
 */
function setPortraitView(event){
    var tr = event.target;
    var div = document.getElementById('studentsContainer');
    var oldTable = document.getElementById('students');
        if (oldTable != undefined) {
            div.removeChild(oldTable);
        }
}