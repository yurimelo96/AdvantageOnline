# Automacao

Este projeto de automacao de testes visa cobrir o Desafio da Keeggo

## detalhes
o projeto e estruturado como page object na divisao de pacotes
utiliza Selenium com java versao 8.
cenarios de testes escritos em gerkin.

## pre requisitos
os cenarios escritos estao no diretorio Features
para execução é necessario baixar o driver na versao do navegador que voce possui instalado em sua maquina local, no diretorio driver/

## executando
executar os arquivos do pacote runner

caso seja necessario evitar algum cenario basta adicionar '@skip' no inicio do cenario no arquivo feature.

## *importante*

validar versao de driver e extensao do mesmo, caso seja necessario atualizar o arquivo "BaseTest" presente no pacote core. 
