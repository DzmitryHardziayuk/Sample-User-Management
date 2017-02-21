$(document).ready(function () {
    // render initial list of users
    $.ajax(
        {
            url: '/users/' + 0,
            dataType: 'html',
            success: function (result) {
                $('#user-list').html(result);
            }
        });
})


