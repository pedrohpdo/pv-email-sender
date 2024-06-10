## Configurando as Variáveis de Ambiente 🌐

O projeto utiliza um arquivo `.properties` para armazenar informações sensíveis, como credenciais do banco de dados e configurações de autenticação.

Caso queira executar o projeto localmente, certifique-se de criar um arquivo .properties na raiz do projeto e configurar as variáveis necessárias.

Dentro dele crie a seguintes credenciais, ou implemente seus respectivos valores:

Lembre-se de criar seu arquivo dentro de uma pasta 

### Server/Database configuration
`server.port=sua_url_do_banco` <br>
`spring.jpa.hibernate.ddl-auto=update` <br>
`spring.datasource.url=jdbc:mysql://sua-url-banco/nome-database` <br>
`spring.datasource.username=seu-username` <br>
`spring.datasource.password=sua-senha` <br>
`spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver` <br>
`spring.jpa.show-sql: true`

### Stmt Email configuration
`spring.mail.host=smtp.gmail.com` <br>
`spring.mail.port=587` <br>
`spring.mail.username=seu-email-envio` <br>
`spring.mail.password=senha-app-google` <br>
`spring.mail.properties.mail.smtp.auth=true` <br>
`spring.mail.properties.mail.smtp.starttls.enable=true`