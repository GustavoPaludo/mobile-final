Na pasta mobile-core, executar o comando start (Se estiver no windows, executar o start.bat, se estiver no linux, o start.sh). Para tal se assegurar que o docker está instalado corretamente. No Windows o Docker Desktop deve estar instalado, e de preferência estar com o WSL instalado.

No Ubuntu, navegar até o diretório do bash start.sh (tambem pode ser aberto um novo terminal clicando com o botão direito dentro da pasta em que está o script), e executando o comando 'sudo ./start.sh'.

No Windows, o processo é o mesmo, mas o comando que será executado é o '.\start.bat'.

Baixar o workbench ou o dBeaver e configurar a conexão com esse banco. O usuário e senha são 'master'. O nome da base é 'mobile' e a porta é a 3306.

ATENÇÃO: O banco deve estar de pé antes de iniciar a execução do servidor.

Para iniciar o servidor, ir até a pasta mobile-core/src/main/java/com/mobile/ e executar a classe SpringBootDataJpaApplication, que é um main da aplicação Spring. Ao iniciar, será feita automaticamente a conexão com o banco (préviamente inicializado)

No aplicativo Android Java deverá ser alterado o IP do servidor conforme o IPV4 da máquina. Para descobrir o ip da máquina, digite 'hostname -I' no Ubuntu ou 'ipconfig' no Windows. Com esse ip, vá até a classe AppConstants.java localizada em mobile-app\app\src\main\java\com\udesc\projetofinal\AppConstants.java. Subustituir o ip na constante 'serverUrl' pelo IPV4 da máquina em que o servidor está rodando.
