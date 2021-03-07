new Morris.Line({
    element: "grafico3",
    data: [
        {año: "2017", valor: 23, valor1: 34},
        {año: "2018", valor: 22, valor1: 28},
        {año: "2019", valor: 30, valor1: 45},
        {año: "2020", valor: 20, valor1: 36}
    ],
    xkey: "año",
    ykeys: [ "valor", "valor1"],
    lineWidth: 1,
    labels:["Visitantes", "Domiciliarios"],
    resize: true,
    lineColors:["#42F2F7 ","#C43331"]
});
new Morris.Line({
    element: "grafico4",
    data: [
        {año: "2017", valor: 57, valor1: 20},
        {año: "2018", valor: 30, valor1: 40},
        {año: "2019", valor: 45, valor1: 30},
        {año: "2020", valor: 30, valor1: 25}
    ],
    xkey: "año",
    ykeys: [ "valor", "valor1"],
    lineWidth: 1,
    labels:["Paqueteria", "Cartas"],
    resize: true,
    lineColors:["#C43331  ","#42F2F7"]
});

new Morris.Bar({
    element: "grafico5",
    data:[
        {y: "Reservas-2018", a:30, b:34, c:34},
        {y: "Reservas-2019", a:28, b:25, c:18},
        {y: "Reservas-2020", a:10, b:7, c:12},
        
    ],
    xkey: "y",
    ykeys: ["a", "b", "c"],
    barWidth: 3,
    resize:true,
    labels: ["Zona BBQ", "Salón Comunal", "Azotea"],
    barColors: ["#C43331","#42F2F7", "#3a3a3a"],
    gridTextFamily: "comic sans"
})
new Morris.Line({
    element: "grafico6",
    data: [
        {año: "2018", valor: 30, valor1: 34, valor2: 34},
        {año: "2019", valor: 28, valor1: 25, valor2:18},
        {año: "2020", valor: 10, valor1: 7, valor2: 12}
        
    ],
    xkey: "año",
    ykeys: [ "valor", "valor1", "valor2"],
    lineWidth: 1,
    labels:["Zona BBQ", "Salon Comunal", "Azotea"],
    resize: true,
    lineColors:["#C43331  ","#42F2F7", "#3a3a3a"]
});
