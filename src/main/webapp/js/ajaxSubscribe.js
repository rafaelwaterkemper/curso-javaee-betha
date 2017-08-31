var subscribe = document.querySelector("#subscribe");
var nome = document.querySelector("#nome");
var email = document.querySelector("#email");
var URL = "http://localhost:8080/learnMaven-1.0-SNAPSHOT/api/interessados";

var success = "<h5 class='col-8'>Obrigado por se interessar em nosso produto!</h5>" +
              "<h6 class='col-8'>Entraremos em contato com você o mais breve possível</h6>"

subscribe.addEventListener("click", function () {
    $.ajax({
        type: "POST",
        url: URL,
        data: JSON.stringify(getData()),
        contentType: "application/json",
        success: function () {
            alert('Entraremos em contato com você em breve! \n ' +
                'Obrigado por nos escolher!')
            cleanForm();
            nome.focus();
        }
    });

});

function getData() {
    return {
        nome: nome.value,
        email: email.value
    }
}

function cleanForm(){
    nome.value = "";
    email.value = "";
}