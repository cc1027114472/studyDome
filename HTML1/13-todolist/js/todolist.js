$(function() {


    $("#title").on("keydown", function(event) {
        if (event.keyCode === 13) {
            // 先读取本地储存原来的数据
            var local = getDate();
            console.log(local);

            //把这个数组local 存储给本地储存
            local.push({ "title": $(this).val(), done: false });
            saveData(local);

        }
    });
    // 读取本地储存的数据
    function getDate() {
        var data = localStorage.getItem("todolist");
        if (data !== null) {
            return JSON.parse(data);
        } else {
            return [];
        }
    }
    //保存本地数据
    function saveData(data) {
        localStorage.setItem("todolist", JSON.stringify(data));
    }


});