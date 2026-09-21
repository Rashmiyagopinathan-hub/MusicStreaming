function playSong(song) {
    let player = document.getElementById("player");

    if (player) {
        player.innerText = "▶ Now Playing: " + song;
    }
}

function login(event) {
    event.preventDefault();

    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    if (email && password) {
        alert("Login successful!");
        window.location.href = "index.html";
    }
}

function register() {
    alert("Registration page will be added soon!");
}

function createPlaylist() {
    let name = document.getElementById("playlistName").value;

    if (name) {
        alert("Playlist '" + name + "' created!");
    } else {
        alert("Enter playlist name");
    }
}

document.addEventListener("DOMContentLoaded", function () {
    let search = document.getElementById("search");

    if (search) {
        search.addEventListener("keyup", function () {
            console.log("Searching: " + search.value);
        });
    }
});