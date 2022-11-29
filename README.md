<div align="center">

  # Atividade Avaliativa 
  ## Greenfoot + Herança
</div>

#### Contribuintes: Christopher Thompson, Gian Zanatelli, João Lucas Oliveira, Paulo André Said, Rolph Fadini
#### Curso: Ciência da Computação
#### Turma: CC2M
#### Professor: Vinicius Rosalen da Silva
#### Matéria: Programação Orientada a Objetos I

##

 ## Nesta Atividade Avaliativa foram feitos dois projetos de jogos disintos:
- ### O primeiro utilizando o Greenfoot (ambiente de desenvolvimento integrado usando Java ou Stride).
- ### E o segundo utilizando de 'Herança' em Java para ser construído.
 
<div border-bottom: none>
 
  ## Utilizando Herança: 
</div>

#### No processo de criação do código em Java para o segundo jogo seguimos um modelo para criar as Classes do projeto e seus tipos de relacionamento e desse ponto ek diante deveríamos desenvolver o código de forma que funcionasse como um jogo que pudesse ser testado (jogado).

> #### Modelo a seguir:
![image](https://user-images.githubusercontent.com/102986493/204612365-ffea2e03-5d92-448c-9444-3de1d7c40a90.png)

### Desenvolvimento:
- #### Após criar as classes e relacionamentos utlizamos a função 'Random()' para implementar a decisão de qual seria o personagem e qual seria sua arma, dado que o personagem ja foi sorteado. Novamente a função 'Random()' foi utlizada para definir a vida do personagem e para designar valores fixos aos danos de cada arma.

##

### Combate: 
- #### No combate, foi criado um sistema para permitir o jogador escolher entre correr ou atacar, caso escolha correr ele passa a vez e caso ataque diminui a vida do outro jogador pela quantidade de dano que sua arma inflige. O combate ficará em looping até que a vida de um dos jogadores chegue a zero (morra/perca).

##

### Tratamento de erro: 
- #### O tratamento de exceção foi realizado visando evitar que o jogador (usuário) digite algum valor incorreto no momento em que estiver inserindo suas decisões.

##

### Menu:
- #### O menu criado tem as opções padrões de "Continuar jogando" ou "Parar".

##
