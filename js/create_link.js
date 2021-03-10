function change_link(){
    var select_view = document.getElementById('select_view')
    var sv_options_value = select_view.options[select_view.selectedIndex].value
    switch (sv_options_value) {
        case "соревнований":
            document.location.href = "cve_competitions.html";
            break;
        case "участников":
            document.location.href = "cve_participants.html";
            break;
        case "тренеров":
            document.location.href = "cve_trainer.html";
            break;
        case "видов спорта":
            document.location.href = "create.html";
            break;
        default:
            break;
    }
}

