function verficadora()
{
    let r1 =parseFloat(document.getElementById("re1").value)
    let r2= parseFloat(document.getElementById("re2").value)
    let r3 = parseFloat(document.getElementById("re3").value) 
    if( !isNaN(r1) && !isNaN(r2) && !isNaN(r3))
        {
            return{r1,r2,r3};

            
        }
    else
        {
            
            document.getElementById("mensagem").textContent = "ERRO, digite um valor numérico.";
            return(null);
        }

}


function serie()
{
    let serie= verficadora();
    if(serie){
        let{r1, r2, r3} = serie;
        sominha = r1+r2+r3;
    document.getElementById("mensagem").textContent = "Resultado = " + sominha +" ohms";
    } 
    
}

function paralelo()
    
{  
    let paralelo = verficadora();
    if(paralelo){
        let{r1,r2,r3}= paralelo;
        let sominhaparalelo = 1/( (1/r1) + (1/r2) + (1/r3));
    document.getElementById("mensagem").textContent = "Resultado = " + sominhaparalelo +" ohms";

    }


    

}