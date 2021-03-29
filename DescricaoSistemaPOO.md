# POO-Abstracao
ANDREW WASHINGTON SIQUEIRA CANDIDO MARQUES                    RA: 202051230151
MATHEUS SOARES SCHMIDT                                        RA: 202051869925
NAYARA NUNES PEROCCI                                          RA: 202051131519
FABRICIO TINARELI AGUIAR                                      RA: 202051281006



Princípio da Abstração 

Sistema de Informações acadêmicas (SIA)

O SIA é um novo sistema, criado para simplificar a jornada acadêmica e que permite realizar requerimentos e consultas a todas as demandas dos estudantes. Nesta plataforma, o aluno tem acesso ao plano de ensino, classes, materiais de aula (seja ele EAD ou presencial), cadastro pessoal, histórico escolar, grade curricular, entre outras informações.
Como um sistema bem dinâmico o acesso ao SIA é feito através da matricula (ID do aluno) e uma senha de acesso fornecida pela instituição de ensino, podendo ser alterada posteriormente.
O intuito de uso da plataforma é facilitar o acesso à informação, melhorando a experiencia dos estudantes para que eles tenham um maior controle e interação com as suas atividades acadêmicas.
Desta forma a objetividade desta aplicação acaba por diminuir e simplificar processos acadêmicos e acesso à informações que normalmente exigiam muito tempo para serem concluídos e agora o aluno pode concluir em apenas alguns cliques.


Link Diagrama UML :
https://app.diagrams.net/#HMathschmidt%2FPOO-Abstracao%2Fmaster%2FDiagramaDeClasse.drawio


Link Git Hub Projeto POO: 
https://github.com/Mathschmidt/POO-Abstracao/blob/master/DiagramaDeClasse.drawio


Descrição de propósito e comportamento

1º Objeto: HistoricoEscolar
Armazenar as informações acadêmica do aluno vinculando as notas.
Comportamento: Consulta


2º Objeto: Período
Armazenar as informações Início e Termino que se comunicará com a classe turma.
Comportamento: Novo

3º Objeto: TipoAmbiente
A classe Tipo ambiente tem o objetivo de criar um novo ambiente e vincular com a classe Ambiente.
Comportamento: Novo


4º Objeto: Ambiente
A classe Ambiente tem o objetivo de gerar ambiente e vincular com a classe Ambiente Disciplina.
Comportamento: Gerar 


5º Objeto: AmbienteDisciplina
A classe Ambiente Disciplina tem o objetivo de vincular com a classe Ambiente e a Disciplina. 
Comportamento: Vincular


6º Objeto: Disciplina
A classe Disciplina tem o objetivo de criar e armazenar as informações de cada disciplina.
Comportamento: Novo e Unir 


7º Objeto: TipoDisciplina
A classe Tipo Disciplina tem o objetivo de criar um novo tipo de Disciplina e vincular na classe Disciplina
Comportamento: Novo 


