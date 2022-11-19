var attempt = 3;
function validate() {
    var user = document.getElementById("user").value;
    var passaword = document.getElementById("passaword").value;
    var mail = document.getElementById("mail").value;
    if (user == "admin" && passaword == "admin123") {
        alert("Ingreso exitoso");
        window.location = "index.html";
        return false;
    } if (user == "user" && passaword == "user123") {
        alert("Ingreso exitoso");
        window.location = "shop.html";
        return false;
    }
    else {
        attempt--;
    }
    alert("Te queda " + attempt + " intentos mas")
    if (attempt == 0) {
        document.getElementById("user").disable = true;
        document.getElementById("mail").disable = true;
        document.getElementById("passaword").disable = true;
        document.getElementById("sumbit").disable = true;

    }
}