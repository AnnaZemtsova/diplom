$(function() {

    var $input = $(".input-field input");
    var $clearIcon = $('.input-field .clear-icon');
    var $editIcon = $('.input-field .edit-icon');

    $('html').click(function () {
        $input.removeClass("active");
    });

    $input.click(function (event) {
        $input.removeClass("active");
        $(this).addClass("active");
        event.stopPropagation();
    });

    $clearIcon.click(function (event) {
        $input.removeClass("active");
        event.stopPropagation();
    });

    $editIcon.click(function (event) {
        $input.removeClass("active");
        $(this).closest('.input-field').find('input').addClass('active').focus();
        event.stopPropagation();
    });

});
