<html>
<body>
<table border="2">
<tbody>
<#list data as item>
    <tr>
        <td> ${item.surname}</td>
        <td>${item.name}</td>
<td>${item.age}</td>
<td>${item.groupNum}</td>
    </tr>
</#list>
</tbody>
</table>
</body>
</html>