/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  G0042204
 * Created: 13/09/2017
 */

SELECT COUNT(*) FROM "PUBLIC".ANJO_MODELO;
SELECT COUNT(*) FROM "PUBLIC".ANJO_MODELO_2;

INSERT INTO "PUBLIC"."PUBLIC".ANJO_TRANSMISSAO_2 (NOME, ATIVO) 
SELECT NOME, ATIVO FROM "PUBLIC".ANJO_TRANSMISSAO;


INSERT INTO "PUBLIC"."PUBLIC".ANJO_SUB_PRODUTO_MOTIVO_2 (ATIVO, NOME, PRODUTO_ID) 
SELECT SM.ATIVO, SM.NOME, P2.ID FROM "PUBLIC".ANJO_SUB_PRODUTO_MOTIVO SM
LEFT JOIN "PUBLIC".ANJO_PRODUTO P ON SM.PRODUTO_ID = P.ID
LEFT JOIN "PUBLIC".ANJO_PRODUTO_2 P2 ON P.NOME = P2.NOME;


INSERT INTO "PUBLIC"."PUBLIC".ANJO_MODELO_2 (LISTA, NOME, FABRICANTE_ID, ATIVO) 
-- SELECT * FROM "PUBLIC".ANJO_MODELO M
SELECT LISTA, NOME, P2.ID, ATIVO FROM "PUBLIC".ANJO_MODELO M
LEFT JOIN "PUBLIC".ANJO_FABRICANTE P ON M.FABRICANTE_ID = P.ID
LEFT JOIN "PUBLIC".ANJO_FABRICANTE_2 P2 ON P.NOME = P2.NOME;


INSERT INTO "PUBLIC"."PUBLIC".ANJO_FABRICANTE_2 (LISTA, NOME, ATIVO) 
SELECT LISTA, NOME, ATIVO FROM "PUBLIC".ANJO_FABRICANTE

INSERT INTO "PUBLIC"."PUBLIC".ANJO_DETALHE_DUVIDA_2 (ATIVO, LISTA, NOME) 
SELECT  ATIVO, LISTA, NOME FROM "PUBLIC".ANJO_DETALHE_DUVIDA;

INSERT INTO "PUBLIC"."PUBLIC".ANJO_EQUIPAMENTO_2 (LISTA, NOME, ATIVO) 
SELECT LISTA, NOME, ATIVO FROM "PUBLIC".ANJO_EQUIPAMENTO;


INSERT INTO "PUBLIC"."PUBLIC".ANJO_DUVIDA_2 (LISTA, NOME, ATIVO) 
SELECT LISTA, NOME, ATIVO FROM "PUBLIC".ANJO_DUVIDA;


INSERT INTO "PUBLIC"."PUBLIC".ANJO_INFO_EQUIPAMENTO_2 (EQUIPAMENTO_ID, FABRICANTE_ID, MODELO_ID) 
SELECT E2.ID, F2.ID, M2.ID FROM "PUBLIC".ANJO_INFO_EQUIPAMENTO IE
LEFT JOIN "PUBLIC".ANJO_EQUIPAMENTO E ON E.ID = IE.EQUIPAMENTO_ID
LEFT JOIN "PUBLIC".ANJO_EQUIPAMENTO_2 E2 ON E2.NOME = E.NOME
LEFT JOIN "PUBLIC".ANJO_FABRICANTE F ON F.ID = IE.FABRICANTE_ID
LEFT JOIN "PUBLIC".ANJO_FABRICANTE_2 F2 ON F2.NOME = F.NOME
LEFT JOIN "PUBLIC".ANJO_MODELO M ON M.ID = IE.MODELO_ID
LEFT JOIN "PUBLIC".ANJO_MODELO_2 M2 ON M.NOME = M2.NOME


INSERT INTO "PUBLIC"."PUBLIC".ANJO_INFO_PRODUTO_2 (PRODUTO_ID, SUBPRODUTOMOTIVO_ID) 
SELECT E2.ID, M2.ID FROM "PUBLIC".ANJO_INFO_PRODUTO IE
LEFT JOIN "PUBLIC".ANJO_PRODUTO E ON E.ID = IE.PRODUTO_ID
LEFT JOIN "PUBLIC".ANJO_PRODUTO_2 E2 ON E2.NOME = E.NOME
LEFT JOIN "PUBLIC".ANJO_SUB_PRODUTO_MOTIVO M ON M.ID = IE.SUBPRODUTOMOTIVO_ID
LEFT JOIN "PUBLIC".ANJO_SUB_PRODUTO_MOTIVO_2 M2 ON M2.NOME = M.NOME AND M2.PRODUTO_ID = E2.ID



-- INSERT INTO "PUBLIC"."PUBLIC".ANJO_ATENDIMENTO_2 (ACIONADOFALHAEQP, ACIONADOFALHASIS, ACIONADOSUPORTE, CODIGO, DATAREGISTRO, FALHAEQP, FALHASIS, INSTANCIA, MATRICULAOPERADOR, NOMESUPORTE, ORDEM, OUTRASINFORMACOES, DETALHEDUVIDA_ID, DUVIDA_ID, INFOEQUIPAMENTO_ID, INFOPRODUTO_ID, SOLUCAO_ID, TRANSMISSAO_ID, USUARIOEFIKA_LOGIN) 
SELECT 
-- ACIONADOFALHAEQP, ACIONADOFALHASIS, ACIONADOSUPORTE, CODIGO, DATAREGISTRO, FALHAEQP, FALHASIS, INSTANCIA, MATRICULAOPERADOR, NOMESUPORTE, ORDEM, D2.ID, DV2.ID, 
-- INFOEQUIPAMENTO_ID, 
-- INFOPRODUTO_ID, SOLUCAO_ID, TRANSMISSAO_ID, USUARIOEFIKA_LOGIN, OUTRASINFORMACOES
EQ1.NOME, IE1.*, A.INFOEQUIPAMENTO_ID
FROM "PUBLIC".ANJO_ATENDIMENTO A
LEFT JOIN "PUBLIC".ANJO_DETALHE_DUVIDA D1 ON D1.ID = A.DETALHEDUVIDA_ID
LEFT JOIN "PUBLIC".ANJO_DETALHE_DUVIDA_2 D2 ON D2.NOME = D1.NOME
LEFT JOIN "PUBLIC".ANJO_DUVIDA DV1 ON DV1.ID = A.DUVIDA_ID
LEFT JOIN "PUBLIC".ANJO_DUVIDA_2 DV2 ON DV2.NOME = DV1.NOME
LEFT JOIN "PUBLIC".ANJO_INFO_EQUIPAMENTO IE1 ON IE1.ID = A.INFOEQUIPAMENTO_ID
LEFT JOIN "PUBLIC".ANJO_EQUIPAMENTO EQ1 ON EQ1.ID = IE1.EQUIPAMENTO_ID
LEFT JOIN "PUBLIC".ANJO_FABRICANTE FB1 ON FB1.ID = IE1.FABRICANTE_ID
LEFT JOIN "PUBLIC".ANJO_MODELO MD1 ON MD1.ID = IE1.MODELO_ID
WHERE EQ1.NOME <> 'Nenhuma das opões disponíveis'



SELECT IE2.ID FROM "PUBLIC".ANJO_INFO_EQUIPAMENTO_2 IE2
LEFT JOIN "PUBLIC".ANJO_EQUIPAMENTO_2 EQ2 ON EQ2.ID = IE2.EQUIPAMENTO_ID
LEFT JOIN "PUBLIC".ANJO_FABRICANTE_2 FB2 ON FB2.ID = IE2.FABRICANTE_ID
LEFT JOIN "PUBLIC".ANJO_MODELO_2 MD2 ON MD2.ID = IE2.MODELO_ID
WHERE 1=1
AND EQ2.NOME = ''
AND FB2.NOME = ''
AND MD2.NOME = ''