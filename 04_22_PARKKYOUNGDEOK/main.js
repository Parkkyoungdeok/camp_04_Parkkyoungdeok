

$("#a1").mouseover(function () { 
    $("#a1").css('background-color','gray');
});

$("#a1").mouseout(function () { 
    $("#a1").css('background-color','white');
});

$("#a2").mouseover(function () { 
    $("#a2").css('background-color','gray');
});

$("#a2").mouseout(function () { 
    $("#a2").css('background-color','white');
});

$("#a3").mouseover(function () { 
    $("#a3").css('background-color','gray');
});
$("#a3").mouseout(function () { 
    $("#a3").css('background-color','white');
});
$("#a4").mouseover(function () { 
    $("#a4").css('background-color','gray');
});
$("#a4").mouseout(function () { 
    $("#a4").css('background-color','white');
});
$("#a5").mouseover(function () { 
    $("#a5").css('background-color','gray');
});
$("#a5").mouseout(function () { 
    $("#a5").css('background-color','white');
});



$("#title").mouseover(function () { 
    $("#title").css('background-color','gray');
});

$("#title").mouseout(function () { 
    $("#title").css('background-color','white');
});

$("#title").click(function() {
    $("#title").animate(0,1000);
        window.location.reload(false);
    });


 
$("#a1").click(function () { 
    if (confirm('ページを移動しますか？')) {
        　window.open('https://news.yahoo.co.jp','_blank');
        }
}); 
$("#a2").click(function () { 
    if (confirm('ページを移動しますか？')) {
        window.open('https://news.google.co.jp','_blank');
            }
});






$("#a3").click(function () { 
    if (confirm('ページを移動しますか？')) {
        window.open('http://www.google.com','_blank');
        }
    });


$("#a4").click(function () { 
    if (confirm('ページを移動しますか？')) {
        window.open('https://twitter.com/search-home?lang=ja','_blank');
      }
    });


$("#a5").click(function () { 
    if (confirm('ページを移動しますか？')) {
        window.open('https://https://www.yahoo.co.jp/','_blank');
    }
    });