var Brewer = Brewer || {};

Brewer.GraficoVendaPorMes = (function() {
	
	function GraficoVendaPorMes() {
		this.ctx = $('#graficoVendasPorMes')[0].getContext('2d');
	}
	
	GraficoVendaPorMes.prototype.iniciar = function() {
		var graficoVendaPorMes = new Chart(this.ctx, {
			type: 'line',
			data: {
				labels: ['Jan', 'Fev', 'Mar', 'Abr', 'Jun'],
				datasets: [{
					label: 'Venda por mês',
					backgroundColor: "rgba(26,179,148,0.5)",
					pointBorderColor: "rgba(26,179,148,1)",
					pointBackgroundColor: "#fff",
					data: [10,5,7,2,9]
				}]
			},
		});
	}
	
	return GraficoVendaPorMes;
}());

$(function() {
	var graficoVendaPorMes = new Brewer.GraficoVendaPorMes();
	graficoVendaPorMes.iniciar();
	
});