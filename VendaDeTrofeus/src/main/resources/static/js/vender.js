function cancelar() {
	alert("Venda Cancelada!");
	window.location.replace("http://localhost:8080/painel-caixa");
}

function verificaDados(){
	if(document.getElementById("nome").nodeValue.length < 3){
		alert('Por favor, preencha o campo Nome');
	} else if(document.getElementById("modelo").value == ""){
		alert('Por favor, preencha o campo Modelo');
	} else if(document.getElementById("material").value == ""){
		alert('Por favor, preencha o campo Material');
	} else if(document.getElementById("cor").value == ""){
		alert('Por favor, preencha o campo Cor');
	} else if(document.getElementById("tamanho").value == ""){
		alert('Por favor, preencha o campo Tamanho');
	} else if(document.getElementById("quantidade").value == ""){
		alert('Por favor, preencha o campo Quantidade');
	} else if(document.getElementById("valor").value == ""){
		alert('Por favor, preencha o campo Valor Por Unidade');
	} else if(document.getElementById("pag").value == ""){
		alert('Por favor, preencha o campo Forma De Pagamento');
	} else {
		document.getElementById("btnVenda").type = "submit";
	}
}