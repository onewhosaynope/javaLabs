<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>JSP - Hello World</title>
    </head>

    <body>
        <h1>Страница моей бригады</h1>
        <h2>Состав: Пазов В.С.</h2>
        <h3>Текущая дата и время: <%= (new java.util.Date())%>
        </h3>
        <p>
            <%@ page import="java.io.*" %>

                <% String localAdr="D:/Count_visits.txt" ; //локальный адрес файла Integer visitCount=0; //кол-во
                    посещений сайта File file=new File(localAdr); if (!file.exists()){ file.createNewFile(); } else{ if
                    (file.length() !=0){ FileReader pr=new FileReader(file); BufferedReader bufRead=new
                    BufferedReader(pr); //visitCount=pr.read(); String editedLine; System.out.println(visitCount); while
                    (bufRead.ready()) { //visitCount=pr.read(); editedLine=bufRead.readLine().replaceAll("[^\\d]", "" );
                    //читаем из файла и убираем все кроме цифр visitCount=Integer.parseInt(editedLine);
                    System.out.println(visitCount); } bufRead.close(); pr.close(); } } visitCount++; FileWriter pw=new
                    FileWriter(file); System.out.println(visitCount); pw.write(Integer.toString(visitCount));
                    pw.close(); %>
        </p>
        <p>Количество посещений сайта: <%= visitCount%>
        </p>
        <p><img src="https://miro.medium.com/max/1400/1*dDdKQEH296jQdl7-1pGzww.jpeg" alt="Чашечка кофе"></p>
    </body>

    </html>