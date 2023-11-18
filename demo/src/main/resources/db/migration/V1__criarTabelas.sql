CREATE TABLE produtos
(
    id_prod SERIAL PRIMARY KEY,
    id_empresa INTEGER NOT NULL,
    nome_prod VARCHAR(100) NOT NULL,
    preco_prod VARCHAR(100) NOT NULL,
    deeconto_prod VARCHAR(100),
    imagem_produto BLOB NOT NULL,
    FOREIGN KEY (id_empresa) REFERENCES empresas(id_empresa)
);

CREATE TABLE empresas
(
    id_empresa SERIAL PRIMARY KEY,
    nome_empresa VARCHAR(100) NOT NULL,
    cnpj_empresa VARCHAR(100) NOT NULL
);

CREATE TABLE usuarios
(
    id_usuario SERIAL PRIMARY KEY,
    nome_usuario VARCHAR(100) NOT NULL,
    cpf_usuario VARCHAR(100),
    telefone_usuario VARCHAR(100) NOT NULL,
    imagem_cliente BLOB,
    cupom_usuario VARCHAR(100)
);

CREATE TABLE freteiro
(
    id_freteiro SERIAL PRIMARY KEY,
    nome_freteiro VARCHAR(100) NOT NULL,
    numero_freteiro VARCHAR(100) NOT NULL,
    cpf_freteiro VARCHAR(100) NOT NULL,
    imagem_freteiro BLOB
);

CREATE TABLE veiculos
(
    id_veiculo SERIAL PRIMARY KEY,
    id_freteiro INTEGER NOT NULL,
    placa_veiculo VARCHAR(100) NOT NULL,
    modelo_veiculo VARCHAR(100) NOT NULL,
    ano_veiculo VARCHAR(100) NOT NULL,
    cor_veiculo VARCHAR(100) NOT NULL,
    imagem_veiculo BLOB NOT NULL,
    FOREIGN KEY (id_freteiro) REFERENCES freteiro(id_freteiro)
);

CREATE TABLE carrinho
(
    id_carrinho SERIAL PRIMARY KEY,
    id_usuario INTEGER NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE itens_carrinho
(
    id_itens_carrinho SERIAL PRIMARY KEY,
    id_carrinho INTEGER NOT NULL,
    id_produto INTEGER NOT NULL,
    quantidade_itens INTEGER NOT NULL,
    FOREIGN KEY (id_carrinho) REFERENCES carrinho (id_carrinho),
    FOREIGN KEY (id_produto) REFERENCES produtos (id_produto)
);

CREATE TABLE endereco
(
    id_endereco SERIAL PRIMARY KEY,
    lugar_endereco VARCHAR(100) NOT NULL,
    numero_endereco VARCHAR(100) NOT NULL,
    complemento_endereco VARCHAR(100),
    ponto_referencia_endereco VARCHAR(100)
);

CREATE TABLE pedidos
(
    id_pedido SERIAL PRIMARY KEY,
    id_usuario INTEGER NOT NULL,
    id_endereco INTEGER NOT NULL,
    forma_pagamento VARCHAR(100) NOT NULL,
    status_pedido VARCHAR(100) NOT NULL,
    total_pedido FLOAT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario),
    FOREIGN KEY (id_endereco) REFERENCES endereco (id_endereco)
);