$.getJSON('https://data.jianshukeji.com/stock/history/000001', function (data) {
    if(data.code !== 1) {
        alert('��ȡ��Ʊ����ʧ�ܣ�');
        return false;
    }
    data = data.data;
    // ȥ�����������
    Highcharts.each(data, function(d) {
        d.length = 2;
    });
    Highcharts.stockChart('container', {
        rangeSelector: {
            selected: 2
        },
        title: {
            text: 'ƽ��������ʷ�ɼ�'
        },
        plotOptions: {
            series: {
                showInLegend: true
            }
        },
        tooltip: {
            split: false,
            shared: true
        },
        series: [{
            // type: 'line',
            id: '000001',
            name: 'ƽ������',
            data: data
        }]
    });
});
