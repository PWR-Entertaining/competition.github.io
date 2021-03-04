function change_view(){
    var select_view = document.getElementById('select_view')
    var sv_options_value = select_view.options[select_view.selectedIndex].value

    competitions_table = document.getElementById('competitions_table')
    participant_table = document.getElementById('participant_table')
    trainers_table = document.getElementById('trainers_table')
    sports_table = document.getElementById('sports_table')
    
    switch (sv_options_value) {
        case "соревнований":
            competitions_table.setAttribute("style", "display: bllock")
            participant_table.setAttribute("style", "display: none")
            trainers_table.setAttribute("style", "display: none")
            sports_table.setAttribute("style", "display: none")
            break;
        case "участников":
            competitions_table.setAttribute("style", "display: none")
            participant_table.setAttribute("style", "display: bllock")
            trainers_table.setAttribute("style", "display: none")
            sports_table.setAttribute("style", "display: none")
            break;
        case "тренеров":
            competitions_table.setAttribute("style", "display: none")
            participant_table.setAttribute("style", "display: none")
            trainers_table.setAttribute("style", "display: bllock")
            sports_table.setAttribute("style", "display: none")
            break;
        case "видов спорта":
            competitions_table.setAttribute("style", "display: none")
            participant_table.setAttribute("style", "display: none")
            trainers_table.setAttribute("style", "display: none")
            sports_table.setAttribute("style", "display: bllock")
            break;
        default:
            break;
    }
}

