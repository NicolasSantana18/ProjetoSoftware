//DOM - Manipular o HTML

//Maneiras de selecionar o HTML

//document.getElementByID() - Selecionar pelo ID
//document.getElementByTag() - Selecionar pela TAG
//document.getEelemntByClass() - Selecionar pela CLASSE
//document.querySelector() - Selecionar pela CLASSE, ID ou TAG


//Capturando o formulário
const form = document.querySelector("#formProduto")

//Adicionando evento de envio ao botão do formulário
form.addEventListener('submit', function(event){
    event.preventDefault()

    const nomeProduto = document.querySelector("#nome").value
    const marcaProduto = document.querySelector("#marca").value
    const tamanho = document.querySelector("#tamanho").value
    const preco = document.querySelector("#preco").value
    const quantidade = document.querySelector("#quantidade").value


    const dados = {
        nomeProduto: nomeProduto,
        marcaProduto: marcaProduto,
        tamanho: tamanho,
        preco: parseFloat(preco),
        quantidade: parseInt(quantidade)
    }
    
    //Fazendo a requisição da API rest
    fetch('http://localhost:8080/roupa' , {
        method : 'POST',
        headers : {
            "Content-Type" : "application/json"
        },

        body : JSON.stringify(dados) //Convertendo o formato Object para JSON
    })

    .then(response => {
        

        if(response.ok){
            Swal.fire({
                title : "ROUPA CADASTRADA COM SUCESSO",
                text :  "ROUPA CADASTRADA",
                icon : "success"
            })
        } else {
            Swal.fire({
                title : "ERRO AO CADASTRAR ROUPA",
                text :  "ROUPA NÃO CADASTRADA",
                icon : "error"
            })
        }

    })

    .catch( erro => {
        Swal.fire({
                title : "ERRO AO CADASTRAR ROUPA",
                text :  "ROUPA NÃO CADASTRADA",
                icon : "error"
            })
    })
})