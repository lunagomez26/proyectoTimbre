var ctx = document.getElementById("grafico1").getContext("2d");
var graf = new Chart(ctx , {
    type: "bar",
    data:{
        labels: ["Guardas", "Residentes", "Administradores"],
        datasets: [{
            label: "Tipos de usuarios",
            data: [5, 315, 5],
            backgroundColor: ["#3a3a3a","#C43331 ", "#42F2F7"]
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});
var ctx = document.getElementById("grafico2").getContext("2d");
var graf = new Chart(ctx , {
    type: "pie",
    data:{
        labels: ["Administradores", "Residentes", "Guardas"],
        datasets: [{
            label: "Mayor interaccion con el sistema",
            data: [30, 50, 20],
            backgroundColor: ["#42F2F7 ","#C43331", " #3a3a3a"]
        }]
    }
    // options: {
    //     scales: {
    //         yAxes: [{
    //             ticks: {
    //                 beginAtZero: true
    //             }
    //         }]
    //     }
    // }
    
});

var ctx = document.getElementById("grafico7").getContext("2d");
var graf = new Chart(ctx , {
    type: "bar",
    data:{
        labels: ["Peticion", "Queja", "Reclamo", "Sugerencia"],
        datasets: [{
            label: "P.Q.R.S",
            data: [28, 15, 18, 5],
            backgroundColor: ["#3a3a3a","#C43331 ", "#42F2F7", "#291F1E"]
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});
console.log('Si esta conectado');

var ctx = document.getElementById("grafico8").getContext("2d");
var graf = new Chart(ctx , {
    type: "pie",
    data:{
        labels: ["Peticiones", "Queja", "Reclamo", "Sugerencia"],
        datasets: [{
            label: "Mayor interaccion con el sistema",
            data: [28, 15, 18, 5],
            backgroundColor: ["#3a3a3a ","#C43331", " #42F2F7", "#291F1E"]
        }]
    }
    // options: {
    //     scales: {
    //         yAxes: [{
    //             ticks: {
    //                 beginAtZero: true
    //             }
    //         }]
    //     }
    // }
    
});