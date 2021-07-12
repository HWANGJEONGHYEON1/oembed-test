let main = {
    init : function () {
        let _this = this;
        $('#btn-search').on('click', function () {
            _this.search();
        });
    },

    search: function(e) {
        let url = $("#searchUrl").val();
        $.ajax({
            type: 'GET',
            url: '/api/social/oembed?url='+url,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            success: function (result) {
                makeTable(result);
            }
        });
    },
}

function makeTable(result) {
    let tableArr = [];
    for (let name in result) {
        tableArr.push("<tr>");
        tableArr.push(`<th scope="row">${name}</th>`);
        tableArr.push("<td>");
        tableArr.push(result[name]);
        if (name === 'thumbnail_url') {
            tableArr.push(`<br /><img src="${result[name]}" alt="썸네일URL" />`);
        }
        tableArr.push("</td>")
        tableArr.push("</tr>");
    }
    $("#table").html(tableArr);
}

main.init();
