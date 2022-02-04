/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*************admin dashboard******************/
const userTable = document.getElementsByClassName('user_table');
buttonTable = document.querySelectorAll('.admin_navBtn');

function toggleSkills() {
    let itemClass = this.className;

    for (i = 0; i < userTable.length; i++) {
        userTable[i].className = 'user_table';
        buttonTable[i].classList.remove('admin_navBtn_active');
    }
    if (itemClass === 'patientBtn admin_navBtn') {
        userTable[0].className = "user_table tableActive";
        this.classList.add("admin_navBtn_active");
    } else if (itemClass === 'doctorBtn admin_navBtn') {
        userTable[1].className = "user_table tableActive";
        this.classList.add("admin_navBtn_active");
    } else if (itemClass === 'adminBtn admin_navBtn') {
        userTable[2].className = "user_table tableActive";
        this.classList.add("admin_navBtn_active");
    }
}

buttonTable.forEach((el) => {
    el.addEventListener('click', toggleSkills);
});

const userForm = document.getElementsByClassName('extraForm'),
        radioFormInput = document.querySelectorAll('input[type=radio][name="role"]');

function toggleForm() {
    let radioClass = this.className;

    for (i = 0; i < userForm.length; i++) {
        userForm[i].className = 'extraForm form-group';
    }

    if (radioClass === 'form-check-input patient') {
        userForm[0].className = "extraForm form-group activeForm";
    } else if (radioClass === 'form-check-input doctor') {
        userForm[1].className = "extraForm form-group activeForm";
    }
}

radioFormInput.forEach((e) => {
    e.addEventListener('click', toggleForm);
});

const confirmAddUserBtn = document.getElementById("confirmAddUserBtn"),
        cancelAddUserBtn = document.getElementById("cancelBtnAddUser"),
        addUserBtn = document.getElementById("addUserBtn"),
        deleteUserBtn = document.querySelectorAll(".deleteUserBtn"),
        confirmDeleteUserBtn = document.getElementById("confirmDeleteUserBtn"),
        cancelDeleteUserBtn = document.getElementById("cancelDeleteUserBtn"),
        editUserBtn = document.querySelectorAll(".editUserBtn");

addUserBtn.addEventListener("click", function () {
    document.getElementsByClassName("add_user_page-title")[0].classList.add("active-title")
    document.getElementsByClassName("add_user_page-title")[1].classList.remove("active-title")
    document.getElementsByClassName("add_user_page")[0].classList.add("user_page_active")

})


confirmAddUserBtn.addEventListener("click", function () {
//    submit form
})

cancelAddUserBtn.addEventListener("click", function () {
    document.getElementsByClassName("add_user_page")[0].classList.remove("user_page_active")
})

cancelAddUserBtn.addEventListener("click", activeRadioForm)


deleteUserBtn.forEach((e) => {
    e.addEventListener("click", function () {
        document.getElementsByClassName("confirmation_deleteUser_page")[0].classList.add("user_page_active")
    });
});

confirmDeleteUserBtn.addEventListener("click", function () {
//    submit form
})
cancelDeleteUserBtn.addEventListener("click", function () {
    document.getElementsByClassName("confirmation_deleteUser_page")[0].classList.remove("user_page_active")
})



editUserBtn.forEach((e) => {
    e.addEventListener("click", hideRadioForm)
    e.addEventListener("click", function () {

        for (i = 0; i < userForm.length; i++) {
            userForm[i].className = 'extraForm form-group';
        }

        let editClassName = this.className

        if (editClassName === 'btn btn-warning editUserBtn editPatient') {
            //        if user click edit button on patient table
            userForm[0].className = "extraForm form-group activeForm";
            radioFormInput[1].checked = true;
        } else if (editClassName === 'btn btn-warning editUserBtn editDoctor') {
            //        if user click edit button on doctor table
            userForm[1].className = "extraForm form-group activeForm";
            radioFormInput[2].checked = true;
        }else{
            radioFormInput[0].checked = true;
        }
        document.getElementsByClassName("add_user_page-title")[1].classList.add("active-title")
        document.getElementsByClassName("add_user_page-title")[0].classList.remove("active-title")
        document.getElementsByClassName("add_user_page")[0].classList.add("user_page_active")
    });
});

const radioFormBtn = document.querySelectorAll('.radioBtn')
function hideRadioForm() {

    for (i = 0; i < radioFormBtn.length; i++) {
        radioFormBtn[i].classList.add("radioBtn_hide");
    }
}

function activeRadioForm(){
    for (i = 0; i < radioFormBtn.length; i++) {
        radioFormBtn[i].classList.remove("radioBtn_hide");
    }
}