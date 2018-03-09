Projeto Final PAD - Douglas Nickson - 20152121011
-----------------------------------------------------

Passo a passo para se utilzar o aplicativo:

-> O projeto foi desenvolvido pela IDE eclipse, logo, é aconselhavel utilizar ele para os testes, ou compilar pelo CMD.

-----------------------------------------------------
-> Executando pelo eclipse
--> Execute o ChatServidor, se aparecer a mensagem "Servidor Online", basta iniciar a classe "ChatCliente" para iniciar o chat.
--> Obs: Ao fechar um Cliente e tentar conectar o mesmo, acontece um bug e não inicia, sendo necessário reiniciar o servidor.

-----------------------------------------------------

-> Executando pelo CMD
--> Primeiramente é necessário subir o servidor de registro, com o comando rmiregistry.
--> Em seguida, basta subir o servidor com o comando "java ChatServidor", e em seguida os clientes "java ChatCliente".

-----------------------------------------------------

-> Utilizando o Chat:

--> Ao iniciar o chat é necessário adicionar um nome, adicione um nome válido, pois é necessário para alguns funções, como o chat privado.
--> O chat possue algumas opções, logo ao iniciar é mostrado um menu com as funcionalidades disponiveis.
--> O chat fica aguardando alguma ação do usuário, para digitar uma mensagem é necessário apertar "enter", logo em seguida vai aparecer uma caixa de mensagem.
--> Para selecionar uma outra opção é necessário digitar as opções como é mostrado no menu, por exemplo, para visualizar o menu, digite /menu.
--> Para verificar os usuários conectados, digite /user.
--> Para entrar no chat privado digite /private, logo em seguida é necessário informar o nome do usuário pelo qual se deseja conversar.
--> Após isso, basta apertar enter para começar a enviar mensagem privadas para o usuario, para sair do privado basta digitar /exit.
--> O segundo usuário deve fazer o mesmo procedimento para participar do chat privado.
--> Para sair do chat, basta digitar /exit.

OBS: No chat privado, digite um nome de usuário válido, o sistema sub entende que você sabe que o usuário existe, e que participa do chat.
OBS: Não se esqueça dos meus 0,25 pontos professor.

Valeu, abraço!

