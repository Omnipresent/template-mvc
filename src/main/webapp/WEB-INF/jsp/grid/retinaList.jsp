
<%@ include file="../common/taglibs.jsp"%>

<head>
<script type="text/javascript">
    $(function() {
        $("#list").jqGrid({
            url : '${ctx}/retina/getRetinaData.htm',
            datatype : 'json',
            mtype : 'GET',
            colNames : ['Id', 'Vulnerability', 'Machine', 'Software'],
            colModel : [{
                name : 'id',
                index : 'id',
                width : 60
            }, {
                name : 'vulnerability',
                index : 'vulnerability',
                width : 150
            }, {
                name : 'machineName',
                index : 'machineName',
                width : 150
            }, {
                name : 'software',
                index : 'software',
                width : 150                
            }],
            pager : '#pager',
            rowNum : 10,
            rowList : [10, 15, 20,22],
            sortname : 'vulnerability',
            sortorder : 'asc',
            viewrecords : true,
            gridview : true,
            altRows : true,
            caption : '${title}',
            jsonReader : {
                root : "rows",
                page : "pgNumber",
                total : "pgAmount",
                records : "totalRecords",
                repeatitems: false
            }
        });
    });
</script>
</head>

    <div class="container-fluid">
        <table id="list">
            <tr>
                <td />
            </tr>
        </table>
        <div id="pager"></div>
    </div>

