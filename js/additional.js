/**
 * Created by Re5PecT on 19.10.2014 г..
 */
$(document).ready(function() {
    $(".cart").hover(function () {
        //$("#fbSidebar").slideToggle("slow");
        $("#fbSidebar").animate({width:'toggle'});
    });
});