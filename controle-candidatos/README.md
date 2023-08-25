# Sistema Para Validação de Processo Seletivo

Desenvolvi esse projeto para aprimorar as habilidades relacionadas ao controle de fluxo em Java. O cenário proposto envolve a criação de um processo seletivo.

Imaginei uma situação em que havia um valor base salarial de `R$ 2.000,00` e os candidatos informavam seus salários pretendidos. A ideia era criar um sistema que determinasse as ações a serem tomadas com base nesses valores. No final, tudo se resumiu a usar a lógica de `if-else` para tomar decisões com base nas diferentes condições.

Primeiro, criei um cenário em que, se o valor do salário base fosse maior que o salário pretendido do candidato, eu imprimiria `"LIGAR PARA O CANDIDATO"`. E, se eles fossem iguais, imprimiria `"LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA"`. Caso contrário, a mensagem seria `"AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS"`.

Depois, dei um passo adiante e criei um controle para selecionar no máximo 5 candidatos para entrevista. Eles seriam selecionados da lista de candidatos, com base em um método que simula valores pretendidos. Basicamente, eu percorri a lista, verifiquei os salários pretendidos e limitei a seleção aos candidatos que atendiam aos critérios.

Em seguida, implementei o momento de imprimir a lista dos candidatos selecionados. Isso facilitaria o contato do RH com esses candidatos para a próxima etapa do processo.

Por fim, criei a parte em que o RH faria as ligações. Com até 3 tentativas para cada candidato, o programa imprimiria mensagens personalizadas dependendo do resultado do contato. Se conseguíssemos contato, a mensagem exibiria que conseguimos falar com o candidato após X tentativas. Se não conseguíssemos, a mensagem seria `"NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]"`.

No geral, esse desafio me permitiu aplicar os conceitos de controle de fluxo e manipulação de `arrays` de maneira prática. Eu pude criar um sistema simulando um processo seletivo real e lidar com diferentes cenários usando `lógica de programação`. Foi uma ótima oportunidade para consolidar meu conhecimento e aprimorar minhas habilidades de resolução de problemas em Java.
