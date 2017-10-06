## Outubro de 2017 - Trabalho - DCC171
##### Aluno: Rian das Dores Alves
##### Matrícula: 201676040
##### Curso: Sistemas de Informação

## Objetivo do Sistema
O sistema foi desenvolvido para um restaurante de pequeno porte, onde o garçom poderá escolher entre as nove mesas pertencentes ao estabelecimento; as mesas estão enumeradas de 1 a 9. Apresentamos no software uma tela onde constam todas as mesas disponíveis para a escolha; as mesas em verde estarão livres e as vermelhas estarão ocupadas; mesmo ocupadas, poderão ser acrescentados mais pedidos na mesa escolhida. Para o encerramento da mesa e sua liberação, o garçom deverá acionar o botão Encerrar Pedido; retornando para a tela de escolha de mesas. 

## Campos Necessários para a Construção das Telas
Foram utilizadas JList onde apresenta ao usuário os itens escolhidos.JCombobox para inserção de itens do Pedido em um Pedido(Mesa Aberta) através da seleção de um item na combo.
Foram utilizados também JButtons para a representação e escolha das mesas. 


## Pontos importantes do funcionamento da interface
Para a realização de um pedido o usuário deverá estar em uma mesa, para isso ele poderá escolher entre as 9 mesas do estabelecimento. Estas mesas foram representadas na Interface através de botões (JButtons). Se o botão (Mesa) estiver verde, a mesa estará vazia e se estiver vermelho a mesa estará ocupada. 
Escolhendo a Mesa, será aberto um novo Pedido. Nesta nova tela, será carregada uma JcomboBox com todos os itens disponíveis no restaurante para servir seus clientes. O usuário deverá selecionar o item na combo e acionar o botão Adicionar, onde o item selecionado será copiado para a JList abaixo e será armazenado também em um ArrayList para poder ser gerenciado posteriormente.  Há também um JButton chamado Voltar, nele o usuário poderá voltar a tela de escolhas de mesa e abrir um outro pedido em uma mesa livre qualquer.
Para realizar o fechamento do Pedido, o usuário deverá abrir a mesa em que deseja encerrar a conta e acionar o botão Encerrar Pedido. Serão calculados o valor total e serão apresentados em uma caixa de diálogo todos os itens do pedido, seus valores e as datas de abertura e fechamento do Pedido. 

## Pontos que apresentaram maior dificuldade de implementação
A dificuldade maior foi no gerenciamento das mesas, para determinar qual estava aberta, qual não estava e com isso gerenciar seus pedidos.
NO que se refere a interface, um pouco de dificuldade na localização dos elementos. 

## Pontos onde podem ser realizadas melhorias futuras

Podem ser realizadas melhorias no que se refere a inserção de novos itens, apesar do menu Cardápio. 
E também melhorias quanto ao Layout das telas de Pedido, onde deve ser inserido um botão de remoção do Pedido. 
