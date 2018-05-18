jQuery(function($) {
    $(".custom-select").select2({
        minimumResultsForSearch: -1,
        width: '100%',
        placeholder: 'Choose Currency'
    });
    $(".custom-select-mcn").select2({
        minimumResultsForSearch: -1,
        width: '100%',
        placeholder: 'MainCoin'
        //allowClear: true
    });
});