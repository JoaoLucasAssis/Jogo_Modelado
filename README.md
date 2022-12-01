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
##
 
## Primeiro Jogo

### Utilizando Greenfoot: 
> #### O primeiro jogo construído pelo grupo foi uma espécie de Run & Gun com um estilo de câmera top-down em terceira pessoa (câmera com vista de cima para baixo) com zumbis.

##

### Desenvolvimento:
- #### Inicialmente foi preciso decidir qual seria o estilo de jogo, e como o implementaríamos no aplicativo Greenfoot. Embora tivéssemos alguma prática com Java o mais desafiador foi entender a plataforma (o que normalmente é o comum, o mais difícil é preparar o ambiente) porém após pegarmos o jeito tudo foi concluído com êxito, criamos classes para o mapa do jogo 'MyWorld' e para os personagens, jogáveis como o personagem do jogador e os injogáveis (zumbis), tivemos que tratar da colisão entre os personagens usando a posição de cada um deles para reconhecer se estava ou não havendo colisão e se sim, tirar vida do personagem/acabar o jogo.

##

### Combate: 
- #### Como dito rapidamente no tópico acima, o combate se trata de correr dos zumbis que vão aparecer periodicamente na tela e atirar neles e conseguir a maior quantidade de pontos até que o tempo ou a vida do jogador chegue a 0, oque ocorrer primeiro.
##

### Tratamento de erro: 
- #### O tratamento de erro foi feito para prevenir que os zumbis não tirassem vida do personagem principal (o jogo só acabaria por tempo e ele seria imortal) e para prevenir que a colisão dos personagens estivesse funcionando corretamente.

##

### Menu:
- #### O jogo não possui um menu propriamente dito, na verdade ele conta com uma tela simples que ao iniciar o jogo o jogador pode começar a jogar e irá para tela de 'fim de jogo' ao acabar o tempo ou morrer, e por lá poderá jogar novamente.

##

## Segundo Jogo

### Utilizando Herança: 
> #### No processo de criação do código em Java para o segundo jogo seguimos um modelo para criar as Classes do projeto e seus tipos de relacionamento e desse ponto ek diante deveríamos desenvolver o código de forma que funcionasse como um jogo que pudesse ser testado (jogado).

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
