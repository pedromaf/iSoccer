# iSoccer
Projeto P3

    Funcionalidades

        1. Gdicionar funcionários.
        2. Gerenciar estado dos jogadores
        3. Gdicionar sócios
        4. Gerenciar valores de contribuições dos sócios
        5. Gerenciar estado de pagamento dos sócios.
        6. Adicionar e gerenciar recursos.
        7. Emitir relatório geral do sistema.

    Classes:

        Input:
            
            Motivação:
                Padronizar e tratar entradas, a classe é responsável por qualquer função de leitura de dados do usuário.

            Solução:
                Classe com funções 'public static', uma vez que não existem instancias da classe input no sistema, mantendo sempre uma unica instância da classe Scanner para todo o sistema. 
            
            Vantagens:
                Reduzir a repetição de código, reduzir a quantidade de instâncias da classe Scanner no sistema, concentrar em uma única classe todas as funções relativas a input de dados, facilitando a manutenção de código.

            Desvantagens:
                Utilização de métodos 'public static', dando acesso irrestrito a classe.

        Login:
            
            Motivação:
                Tornar a validação do login externa a classe principal do sistema, uma vez que so existe uma unica conta de acesso.   

            Solução:
                Usuario e senha de acesso ao sistema são definidos quando o sistema é inicializado, com funções para validar usuario e senha separadas. 
            
            Vantagens:
                O login se torna externo ao sistema, podendo ser modificado sem necessidade de mudanças externas à classe.

            Desvantagens:
                Usuario e senha só podem ser alterados diretamente no código.       

        Isoccer:
            
            Motivação:
                Classe principal do sistema, responsável pelo fluxo principal do programa e pelo armazenamento dos dados. 

            Solução:
                Os dados referentes a funcionários, sócios e recursos são guardados em ArrayLists de acesso privado separadamente, só é possível acessar as funcionalidades do sistema passando pela função entrar().  
            
            Vantagens:
                Fácil manipulação e controle dos dados.

            Desvantagens:        
                Classe com muitos métodos, alta responsabilidade.

        Funcionario:
            
            Motivação:
                Reunir os dados comuns a todos os funcionários e classificar funcionários com base na função.

            Solução:
                A função é expecificada por um enum 'Cargo'.
            
            Vantagens:
                Evita a repetição de atributos (nome, email, cpf, ...) em varias classes diferentes, evita a criação de uma classe expecifica para cada funcionário de cargo diferente uma vez que a maioria não tem dados além dos utilizados na classe Funcionario.

            Desvantagens:        
                Funções com switch cases extensos.

        Jogador:
            
            Motivação:
                Distinguir entre diferentes tipos de jogador (zagueiro, meia, goleiro, ...), controlar o estado de aptdão do jogador. 

            Solução:
                Tipo de jogador definido por um enum 'Tipo' e função que altera o estado de aptdão.
            
            Vantagens:
                Exclui a necessidade de tratar essas informações na classe funcionário.

            Desvantagens:
                Necessidade de sobrescrever funções referentes a interface 'Relatorio' da classe Funcionario.

        RecursoFisico:
            
            Motivação:
                Identificar os recursos fisicos.

            Solução:
                Classe implementada com variavel 'identificacao' comum a todos os recursos (valores diferentes para cada recurso).
            
            Vantagens:
                Evita a necessidade de repetir a declaração da variavel de identificação em todas as classes de reucursos físicos.

            Desvantagens:        
                Classe com pouca informação associada, servindo apenas para identificar as instancias das subclasses.

        Sociotorcedor:
            
            Motivação:
                Guardar informações, gerenciar o estado de pagamento e identificar o tipo de sócio.

            Solução:
                Tipo de sócio definidor por enum 'Tipo', e função que altera estado de pagamento.
            
            Vantagens:
                Todos os dados referentes ao sócio, independente de tipo, estão na classe.

            Desvantagens:        
                ...

        Console:
            
            Motivação:
                Classe responsável pelo output.

            Solução:
                Métodos 'public static'.
            
            Vantagens:
                Fácil modificação de qualquer output textual do sistema.

            Desvantagens:
                Classe responsável pelo output de divérsas funcionalidades diferentes do sistema.

        Erro:
            
            Motivação:
                Classe responsável pelas mensagens de erro.

            Solução:
                Métodos 'public static'. 
            
            Vantagens:
                Fácil modificação de qualquer mensagem de erro do sistema.

            Desvantagens:
                Classe responsável por mensagens de erro de diversas classes diferentes.
                
Obs: as demais classes não relatadas aqui tem exclusivamente a função de guardar dados.                


    Interface:

        Motivação:
            Garantir que todos os objetos tratados pelo sistema tenham a capacidade de gerar um relatório individual.

        Solução:
            Interface 'Relatório' garante que todo objeto tenha a função relatorio() que expressa seus dados de maneira organizada.

        Vantages:
             Permite que um relatório geral possa ser gerado facilmente apenas solicitando trechos individuais de cada objeto. 

        Desvantagens:
            Não garante a obrigatoriedade das subclasses expressarem seus dados.

    Tratamento de Exceções:

        Motivação:
            Tratar entradas numéricas. (NumberFormatException)

        Solução:
            Dados são solicitados novamente após entradas inválidas

        Vantages:
            Sistema não tem a execução interrompida por erros de input do usuário.

        Desvantagens:
            ...
