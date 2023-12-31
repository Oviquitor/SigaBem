CREATE TABLE veiculo
(
    id             BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    descricao      VARCHAR(500) NOT NULL,
    marca          VARCHAR(100),
    classificacao  VARCHAR(150),
    categoria      VARCHAR(150),
    serie          VARCHAR(100),
    desabilitado   BOOL                  DEFAULT FALSE,
    modelo         VARCHAR(150),
    ano            INT,
    cor            VARCHAR(100),
    chassis        VARCHAR(500),
    numero         INT,
    placa          VARCHAR(7),
    capacidade     FLOAT,
    potencia       FLOAT,
    combustivel    FLOAT,
    revisao        VARCHAR(8),
    id_motorista   BIGINT       NOT NULL,
    FOREIGN KEY (id_motorista) REFERENCES funcionario (id),
    nome_motorista VARCHAR(255),
    nome_comprador VARCHAR(255),
    observacao     VARCHAR(2000),
    createdAt      TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updateAt       TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)