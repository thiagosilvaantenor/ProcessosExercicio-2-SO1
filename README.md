# Exercício 2 de Processos - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

</div>

## Sobre o projeto
Este é o exercício 2, da lista de exercícios de processos em Windows e Linux, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.

## Índice
=================
<!--ts-->
* [Título](#exercício-2-de-processos---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 2](#exercício-2)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 2

* Fazer, em java, uma aplicação que liste os processos ativos, permita ao usuário entrar com o
nome ou o PID do processo e o mate.
* A aplicação deverá funcionar, minimamente em Windows e Linux (Alunos com Mac podem fazer
para os 3 SO).
* É notório que cada SO tem comandos diferentes para as ações supracitadas, portanto:<br>
Criar em Eclipse, um novo Java Project com uma classe chamada `KillController.java` no package
`controller` e uma classe `Main.java` no package `view`.

* A classe `KillController.java` deve ter 4 métodos.
  1) O primeiro, chamado `os`, que identifica e retorna o nome do Sistema Operacional (Fazê-lo
  privado)
  2) O segundo, chamado `listaProcessos`, que verifica o SO e, de acordo com SO, selecione o
  comando para listar os processos ativos.<br>
  O método deve receber todas as linhas de saída do processo de listagem e exibi-las em console
  3) O terceiro, chamado `mataPid`, que recebe um PID como parâmetro de entrada, verifica o SO
  e, de acordo com SO, selecione o comando para matar o processo e o finalize.
  4) O quarto, chamado `mataNome`, que recebe um nome de processo como parâmetro de
  entrada, verifica o SO e, de acordo com SO, selecione o comando para matar o processo e o
  finalize.

* Dicas:
  1) Chamada de processo para listagem da tabela de processos:
  Windows: `TASKLIST /FO TABLE`
  Linux: `ps -ef`
  2) Chamada de processo que mata processo por PID:
  Windows: `TASKKILL /PID pid_do_processo`
  Linux: `kill -9 pid_do_processo`
  3) Chamada de processo que mata processo por Nome:
  Windows: `TASKKILL /IM nome_do_processo`
  Linux: `pkill -f nome_do_processo`


## Status do projeto
✅ Finalizado ✅

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Runtime](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html)
  - [JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)
  - [BufferedWriter](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)
  - [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)
  - [InputStreamReader](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, Leandro Colevati, por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
