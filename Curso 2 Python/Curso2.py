class Programa:

    def __init__(self, nome, ano):
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Likes: {self._likes}'

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    @property
    def likes(self):
        return self._likes

    def dar_likes(self):
        self._likes += 1
    
class Filme(Programa):
    
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self._duracao = duracao

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Duração: {self._duracao} - Likes: {self._likes}'

    @property
    def duracao(self):
        return self._duracao

class Serie(Programa):

    def __init__(self, nome, ano, temporada):
        super().__init__(nome, ano)
        self._temporada = temporada

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Temporada: {self._temporada} - Likes: {self._likes}'

    @property
    def temporada(self):
        return self._temporada

# --> AQUI A PLAYLIST HERDA DA CLASSE LIST <--
# class Playlist(list):
#     def __init__(self, nome, programas):
#         self._nome = nome
#         super().__init__(programas)

class Playlist():
    def __init__(self, nome, programas):
        self._nome = nome
        self._progrmas = programas

    def __getitem__(self, item):    # Duck typing
        return self._progrmas[item]

    @property
    def listagem(self):
         return self._progrmas

    def __len__(self):
        return len(self._progrmas)

    # @property
    # def tamanho(self):
    #     return len(self._progrmas)

#____________________________________________________________________________________#
#-------------------------------------- Execução ------------------------------------#
#____________________________________________________________________________________#

#--------------------------------- Setando valores ----------------------------------#

vingadores = Filme("vingadores", 2018, 160)
atlanta = Serie('atlanta', 2018, 2)
tmep = Filme('Todo mundo em pânico', 1999, 100)
demolidor = Serie('Demolidor', 2016, 2)

demolidor.dar_likes()
demolidor.dar_likes()
demolidor.dar_likes()
demolidor.dar_likes()

tmep.dar_likes()
tmep.dar_likes()
tmep.dar_likes()

vingadores.dar_likes()
vingadores.dar_likes()
vingadores.dar_likes()

atlanta.dar_likes()
atlanta.dar_likes()

#--------------------------------- Listando valores ----------------------------------#

lista_filme_e_serie = [vingadores, atlanta, demolidor, tmep]
playlist = Playlist("Favoritos", lista_filme_e_serie)

#---------------------------- Iterando e imprimindo valores ---------------------------#

print(f"O tamanho da playlist {len(playlist)}")

for programa in playlist:
    print(programa)

print(f"Playlist contém demolidor? {demolidor in playlist}")