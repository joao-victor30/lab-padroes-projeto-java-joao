 # Implementações realizada.

Repositório com implementações práticas dos padrões de projeto estudados no Lab "Explorando Padrões de Projetos na Prática com Java". Todas as classes foram refatoradas para código mais moderno, limpo e seguro, usando Java puro.

Padrões implementados e melhorias aplicadas:

# Singleton – Instâncias únicas com thread-safety, inicialização preguiçosa (Lazy) e eager (Eager), além do padrão LazyHolder. Adicionado toString() para fácil identificação de instâncias.

# Strategy – Robô que muda de comportamento dinamicamente. Todos os comportamentos (Normal, Defensivo, Agressivo) foram padronizados com tags no console e preparados para uso com lambdas.

# Facade – Integração entre CepApi e CrmService para migrar clientes, com validação de dados e saída clara no console.

CrmService – Melhorias na saída, incluindo timestamp e formatação organizada.

CepApi – Flexível para múltiplos CEPs, retornando cidade e estado dinamicamente.