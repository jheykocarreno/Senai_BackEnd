
-- DML (Data Manipulation Language)
-- INSERT (Cadastrar)
-- UPDATE (Atualizar)
-- DELETE (Apagar)

-- OPCIONAL 
-- Activamos o Schema
SET search_path TO clinica;


INSERT INTO clinica.medico (nome, crm, especialidade) VALUES
('Felipe', '123456', 'Neurologia'),
('Mariza', '7891011', 'Cardiologia'),
('Luiz', '121315', 'Ortopedia');


INSERT INTO clinica.paciente (nome, idade, data_nascimento,cpf) VALUES
('Felipe',21,'2004-11-22', '423415329904');

INSERT INTO clinica.clinica(nome, endereco, descricao) VALUES
('Rede Dor', 'R. Dr. Nicolau Assef,
52 - Centro Alto, Ribeirão Pires - SP, 09424-070', 'Clinica de cardiologia');

INSERT INTO clinica.consulta (data, valor, id_medico, id_clinica, id_paciente) VALUES
('2025-08-28 09:30:00-03', 350.75, 7,2,2);

UPDATE clinica.consulta
SET valor = 575.50
WHERE valor >= 200.50 AND valor < 1000;

-- OR

-- DELETE 

DELETE FROM clinica.medico
WHERE id_medico > 3;



select * from clinica;
select * from medico;
select * from paciente;
select * from consulta;

