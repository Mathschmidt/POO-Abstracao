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


8º Objeto: GradeDetalhe 

A classe GradeDetalhe tem como objetivo armazenar as informações de cada grade levando em consideração cada curso, professor, modulo e disciplina.
Comportamento: Vincular, Migra e Procurar 

9º Objeto: DisciplinaProfessor  

A classe DisciplinaProfessor tem como objetivo vincular o ambiente disciplina e o professor.
Comportamento: Vincular, Desvincular e Listar


10º Objeto: Professor 

A classe Professor tem como objetivo armazenar informações de cada professor. 
Comportamento: Novo, Editar e Consultar.


11º Objeto: Grade

A classe Grade tem como objetivo de receber informações da classe curso para a gerar uma grade.
Comportamento: Gerar, Desativar e Obter.


12º Objeto: Modulo

A classe modulo tem como objetivo armazenar informações de cada modulo para a comunicação classe GradeDetalhe.
Comportamento:  Novo


13º Objeto: TipoCurso

A Classe TipoCurso tem como objetivo a criação de um novo tipo de curso e a comunicação com a classe curso.
Comportamento:  Novo

14º Objeto: Curso

A classe Curso armazena informações dos cursos levando em consideração de outras classes como Grade e TipoCurso.
Comportamento:  Novo, Inativar.

15º Objeto: Nota

A classe Nota armazena informações de notas de cada aluno em cada disciplina.
Comportamento:  Lançar, Obter e Media 

16º Objeto: TipoNota

A classe TipoNota e a criação de novo método de avaliação que recebe uma nota.
Comportamento:  Novo


17º Objeto: Turma 

A classe Turma armazena informações de cada turma criada levando em consideração Curso e o Período
Comportamento:  Novo e Consulta


18º Objeto: TurmaAluno

A classe TurmaAluno vincula os alunos matriculado com as turmas criada.
Comportamento:  Vincular, Transferir e Juntar.

19º Objeto: Aluno 

A classe Aluno armazena as informações dos alunos cadastrados.
Comportamento:  Novo, Alterar e Trocar curso.

20º Objeto: Cidade

A classe Cidade armazena todas as cidades e se comunica com a classe Estado. 
Comportamento:  Listar

Exemplares de preenchimento para as classes listadas:

EXEMPLO ENUMERAÇÃO (17) (Turma)

Id:1
Cursoid:1
CodigoTurma:1
Periodoid:1
Datainicio:28/03/2022
DataTermino:28/03/2023

Id:2
Cursoid:2
CodigoTurma:2
Periodoid:2
Datainicio:30/03/2021
DataTermino: 30/03/2022

EXEMPLO ENUMERAÇÃO (2) (Periodo)
Id:1
Nome:Manhã
HorarioInicio:07:00
HorarioTermino:12:00

Id:2
Nome:Tarde
HorarioInicio:13:00
HorarioTermino:18:00

Id:3
Nome:Noite
HorarioInicio:18:00
HorarioTermino:23:00

EXEMPLO ENUMERAÇÃO (7) (Tipodisciplina)
Id:1
Nome:Eng.Software
Ativa:True

Id:2
Nome:Eng.Eletrica
Ativa:True

EXEMPLO ENUMERAÇÃO (10) (Professor)
Id:1
Nome:Valdir de Souza
Matricula:1
Ativa:true

Id:2
Nome:Marcos Evangelista
Matricula:2
Ativa:false

EXEMPLO ENUMERAÇÃO (18) (Turmaaluno)
Id:1
TurmaId:1
AlunoId:1

Id:2
TurmaId:2
AlunoId:2


