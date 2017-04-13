window.onload=function() {
    var head = window.document.getElementsByTagName("head")[0];
    var scripts = head.getElementsByTagName("script");
    var scriptTag = window.document.createElement("script");
    scriptTag.type = "text/javascript";
    scriptTag.src = "https://cdn.rawgit.com/vasikarla/SeleniumExamples/master/sample.js";
    console.log(document.readyState);

    window.document.head.appendChild(scriptTag);
    console.log(window);
    console.log("Screen Y :" + window.screenY);

    console.log("Here");
    console.log(window);
    console.log(window.gremlins);
}();
