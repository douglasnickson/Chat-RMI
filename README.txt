Projeto Final PAD - Douglas Nickson - 20152121011
-----------------------------------------------------

Passo a passo para se utilzar o aplicativo:

-> O projeto foi desenvolvido pela IDE eclipse, logo, � aconselhavel utilizar ele para os testes, ou compilar pelo CMD.

-----------------------------------------------------
-> Executando pelo eclipse
--> Execute o ChatServidor, se aparecer a mensagem "Servidor Online", basta iniciar a classe "ChatCliente" para iniciar o chat.
--> Obs: Ao fechar um Cliente e tentar conectar o mesmo, acontece um bug e n�o inicia, sendo necess�rio reiniciar o servidor.

-----------------------------------------------------

-> Executando pelo CMD
--> Primeiramente � necess�rio subir o servidor de registro, com o comando rmiregistry.
--> Em seguida, basta subir o servidor com o comando "java ChatServidor", e em seguida os clientes "java ChatCliente".

-----------------------------------------------------

-> Utilizando o Chat:

--> Ao iniciar o chat � necess�rio adicionar um nome, adicione um nome v�lido, pois � necess�rio para alguns fun��es, como o chat privado.
--> O chat possue algumas op��es, logo ao iniciar � mostrado um menu com as funcionalidades disponiveis.
--> O chat fica aguardando alguma a��o do usu�rio, para digitar uma mensagem � necess�rio apertar "enter", logo em seguida vai aparecer uma caixa de mensagem.
--> Para selecionar uma outra op��o � necess�rio digitar as op��es como � mostrado no menu, por exemplo, para visualizar o menu, digite /menu.
--> Para verificar os usu�rios conectados, digite /user.
--> Para entrar no chat privado digite /private, logo em seguida � necess�rio informar o nome do usu�rio pelo qual se deseja conversar.
--> Ap�s isso, basta apertar enter para come�ar a enviar mensagem privadas para o usuario, para sair do privado basta digitar /exit.
--> O segundo usu�rio deve fazer o mesmo procedimento para participar do chat privado.
--> Para sair do chat, basta digitar /exit.

OBS: No chat privado, digite um nome de usu�rio v�lido, o sistema sub entende que voc� sabe que o usu�rio existe, e que participa do chat.
OBS: N�o se esque�a dos meus 0,25 pontos professor.

Valeu, abra�o!

