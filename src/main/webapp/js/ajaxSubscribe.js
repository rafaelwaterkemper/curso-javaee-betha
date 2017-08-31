var subscribe = document.querySelector("#subscribe");
var URL = "http://localhost:8080/learnMaven-1.0-SNAPSHOT/api/interessados";

var success = "<h5 class='col-8'>Obrigado por se interessar em nosso produto!</h5>" +
    "<h6 class='col-8'>Entraremos em contato com você o mais breve possível</h6>"

subscribe.addEventListener("click", function () {
    $.ajax({
        type: "POST",
        url: URL,
        data: JSON.stringify(getData()),
        success: function () {
            alert('Entraremos em contato com você em breve! \n ' +
                'Obrigado por nos escolher!')
        }
    });

    // var xhttp = createConfig();

    // xhttp.open("POST", URL, true);
    // xhttp.setRequestHeader("Content-type", "application/json");
    // xhttp.send(JSON.stringify(getData()));
});

function createConfig() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log('TERMINOU O POST');
        }
    };
    return xhttp;
}

function getData() {
    var nome = document.querySelector("#nome").value;
    var email = document.querySelector("#email").value;

    return {
        nome: nome,
        email: email
    }
}