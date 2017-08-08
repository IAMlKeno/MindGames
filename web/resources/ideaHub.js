$(document).ready(function(){
   
});

function changeStatus(checkbox){
    var checked = $(checkbox).attr("checked");
    if(!checked){
        //confirm if i should uncheck it
        if(confirmAction("Are you sure you want to uncheck this?")){
            $(checkbox).attr("checked", false);
        } else {
            $(checkbox).attr("checked", true);
        }
    } else {
        // confirm if I should check it
        if(confirmAction("Are you sure you want to check this?")){
            $(checkbox).attr("checked", true);
        } else {
            $(checkbox).attr("checked", false);
        }
    }
}

function confirmAction(message){
    return confirm(message);
}

