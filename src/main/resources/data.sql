/*-----------------------------User------------------------------------------------------*/
INSERT INTO `db_demo`.`t_user`
VALUES ('1', 'sfax', 0, 'mahdi@live.fr', 1, 'mahdi', "MALE", 'Kallel', '$2y$08$bRzn8LIEIP8v2957JK0hGuzMiESUz9GpvJZ9zk5tjVeoneAvyYAh2', '24256574', 'mahdi');

INSERT INTO `db_demo`.`t_user`
VALUES ('2', 'sfax', 0, 'emna@live.fr', 0, 'emna', "FEMALE", 'Kallel', '123456', '24256574', 'emna');


INSERT INTO `db_demo`.`t_user`
VALUES ('3', 'sfax', 0, 'test@live.fr', 0, 'guest', "FEMALE", 'guest', '123456', '24256574', 'guest');


/*-----------------------------Role------------------------------------------------------*/

INSERT INTO `t_role`
VALUES (1, 'Toutes les permissions pour cette rôle', 'ROLE_SUPER_ADMIN'),
  (2, 'Rôle aléatoire sans génération de rapport', 'ROLE_ADMIN'),
  (3, 'Rôle limité pour un utilisateur invité', 'ROLE_GUEST');

/*----------------------------Authorities------------------------------------------------*/
INSERT INTO `t_authority` VALUES (1, 'Rôle création', 'AUTH_ROLE_CREATE'),
  (2, 'Rôle mise à jour', 'AUTH_ROLE_UPDATE'),
  (3, 'Rôle suppression', 'AUTH_ROLE_DELETE'),
  (4, 'Utilisateur création', 'AUTH_USER_CREATE'),
  (5, 'Utilisateur mise à jour', 'AUTH_USER_UPDATE'),
  (6, 'Utilisateur suppression', 'AUTH_USER_DELETE'),
  (7, 'Génération rapport', 'AUTH_GENERATE_REPORT_EXEC'),
  (8, 'Documentation swagger', 'AUTH_SWAGGER_EXEC'),
  (9, 'Paramètre messagerie', 'AUTH_EMAIL_SETTING_UPDATE'),
  (10, 'Rôle liste', 'AUTH_ROLE_READ'),
  (11, 'Utilisateur liste', 'AUTH_USER_READ'),
  (12, 'Fichiers erronés liste', 'AUTH_FLAT_ERROR_READ'),
  (13, 'Suivie connexion déconnexion', 'AUTH_LOGIN_LOGOUT_TRACK_READ'),
  (14, 'Autorité liste', 'AUTH_AUTHORITY_READ'),
  (18, 'Client liste', 'AUTH_CLIENT_READ'),
  (19, 'Client création', 'AUTH_CLIENT_CREATE'),
  (20, 'Client mise à jour', 'AUTH_CLIENT_UPDATE'),
  (21, 'Client suppression', 'AUTH_CLIENT_DELETE'),
  (22, 'Compte liste', 'AUTH_ACCOUNT_READ'),
  (23, 'Compte création', 'AUTH_ACCOUNT_CREATE'),
  (24, 'Compte mise à jour', 'AUTH_ACCOUNT_UPDATE'),
  (25, 'Compte suppression', 'AUTH_ACCOUNT_DELETE'),
  (26, 'Répértoire scanner liste', 'AUTH_REPOSITORY_READ'),
  (27, 'Répértoire scanner création', 'AUTH_REPOSITORY_CREATE'),
  (28, 'Répértoire scanner mise à jour', 'AUTH_REPOSITORY_UPDATE'),
  (29, 'Répértoire scanner suppression', 'AUTH_REPOSITORY_DELETE'),
  (30, 'Lot suppression', 'AUTH_LOT_DELETE'),
  (31, 'Lot mise à jour', 'AUTH_LOT_UPDATE'),
  (32, 'Lot traitement', 'AUTH_LOT_START'),
  (33, 'Lot liste', 'AUTH_LOT_READ'),
  (34, 'Type de lot liste', 'AUTH_TYPE_LOT_READ'),
  (35, 'Type de lot création', 'AUTH_TYPE_LOT_CREATE'),
  (36, 'Type de lot mise à jour', 'AUTH_TYPE_LOT_UPDATE'),
  (37, 'Type de lot suppression ', 'AUTH_TYPE_LOT_DELETE'),
  (38, 'Suivie historiques ', 'AUTH_HISTORY_READ'),
  (39, 'Configuration scanner liste', 'AUTH_SCANNER_CONF_READ'),
  (40, 'Configuration scanner création', 'AUTH_SCANNER_CONF_CREATE'),
  (41, 'Configuration scanner mise à jour', 'AUTH_SCANNER_CONF_UPDATE'),
  (42, 'Configuration scanner suppression ', 'AUTH_SCANNER_CONF_DELETE'),
  (43, 'Document modèle liste', 'AUTH_TEMPLATE_DOC_READ'),
  (44, 'Document modèle création', 'AUTH_TEMPLATE_DOC_CREATE'),
  (45, 'Document modèle mise à jour', 'AUTH_TEMPLATE_DOC_UPDATE'),
  (46, 'Document modèle suppression', 'AUTH_TEMPLATE_DOC_DELETE'),
  (47, 'Champ de données numérisées liste', 'AUTH_SCANNED_DATA_FIELD_READ'),
  (48, 'Champ de données numérisées création', 'AUTH_SCANNED_DATA_FIELD_CREATE'),
  (49, 'Champ de données numérisées mise à jour', 'AUTH_SCANNED_DATA_FIELD_UPDATE'),
  (50, 'Champ de données numérisées suppression', 'AUTH_SCANNED_DATA_FIELD_DELETE'),
  (51, 'Menu Paramétrage', 'AUTH_PARAMETERS_READ'),
  (52, 'Menu production', 'AUTH_PRODUCTION_READ'),
  (53, 'Quantième liste', 'AUTH_DAY_NUMBER_READ'),
  (54, 'Recherche quantième ', 'AUTH_DAY_NUMBER_SEARCH'),
  (55, 'Recherche lot', 'AUTH_LOT_SEARCH'),
  (56, 'Referentiel list', 'AUTH_REFERENTIAL_READ'),
  (57, 'Referentiel mise à jour', 'AUTH_REFERENTIAL_UPDATE'),
  (58, 'Referentiel suppression', 'AUTH_REFERENTIAL_DELETE'),
  (59, 'Champs Referentiel création', 'AUTH_REFERENTIAL_FIELD_CREATE'),
  (60, 'Champs Referentiel mise à jour', 'AUTH_REFERENTIAL_FIELD_UPDATE'),
  (61, 'Champs Referentiel suppression', 'AUTH_REFERENTIAL_FIELD_DELETE'),
  (62, 'Champs Referentiel list', 'AUTH_REFERENTIAL_FIELD_READ'),
  (63, 'Fraction recherche', 'AUTH_FRACTION_SEARCH'),
  (64, 'Document recherche', 'AUTH_DOCUMENT_SEARCH'),
  (65, 'Synchroniser utilisateur camunda', 'AUTH_USER_CAMUNDA_SYNCHRONIZE'),
  (66, 'Supprimer utilisateur camunda', 'AUTH_USER_CAMUNDA_DELETE'),
  (67, 'Répértoire livrable liste', 'AUTH_REPOSITORY_LIVRABLE_READ'),
  (68, 'Répértoire livrable création', 'AUTH_REPOSITORY_LIVRABLE_CREATE'),
  (69, 'Répértoire livrable mise à jour', 'AUTH_REPOSITORY_LIVRABLE_UPDATE'),
  (70, 'Répértoire livrable suppression', 'AUTH_REPOSITORY_LIVRABLE_DELETE'),
  (71, 'Interception liste', 'AUTH_INTERCEPTION_READ'),
  (72, 'Interception création', 'AUTH_INTERCEPTION_CREATE'),
  (73, 'Interception mise à jour', 'AUTH_INTERCEPTION_UPDATE'),
  (74, 'Interception suppression', 'AUTH_INTERCEPTION_DELETE'),
  (75, 'Recevoir mail de clôture de fin de journée', 'AUTH_MAIL_CLOSE_DAYNUMBER'),
  (76, 'Recevoir les interceptions par mail', 'AUTH_RECEIVE_INTERCEPTIONS_MAIL'),
  (77, 'Menu gestion des rejets', 'AUTH_REJECTION_READ'),
  (78, 'Rejet mis à jour', 'AUTH_REJECTION_UPDATE'),
  (79, 'Rejet suppression', 'AUTH_REJECTION_DELETE'),
  (80, 'Rejet affichage images', 'AUTH_REJECTION_DISPLAY_IMAGE'),
  (81, 'Archive liste', 'AUTH_ARCHIVE_READ'),
  (82, 'Archive création', 'AUTH_ARCHIVE_CREATE'),
  (83, 'Archive mise à jour', 'AUTH_ARCHIVE_UPDATE'),
  (84, 'Archive suppression', 'AUTH_ARCHIVE_DELETE'),
  (85, 'Recevoir mail de fermeture caisse', 'AUTH_SEND_CASE_CLOSED_MAIL'),
  (86, 'Paramétrage des Workflow liste', 'AUTH_WORKFLOW_SETTING_READ'),
  (87, 'Paramétrage des Workflow mise à jour', 'AUTH_WORKFLOW_SETTING_UPDATE'),
  (92, 'Livraison de journée', 'AUTH_DAYNUMBER_DELIVERY'),
  (93, 'Sources courriers liste', 'AUTH_MAIL_SOURCE_READ'),
  (94, 'Sources courriers création', 'AUTH_MAIL_SOURCE_CREATE'),
  (95, 'Sources courriers mise à jour', 'AUTH_MAIL_SOURCE_UPDATE'),
  (96, 'Sources courriers suppression', 'AUTH_MAIL_SOURCE_DELETE'),
  (97, 'Referentiel création', 'AUTH_REFERENTIAL_CREATE'),
  (98, 'Lot création', 'AUTH_LOT_CREATE'),
  (99, 'Modifier date réception de fraction', 'AUTH_FRACTION_UPDATE_RECEPTION_DATE'),
  (100, 'Dupliquer la configuration', 'AUTH_DUPLICATION_CREATE'),
  (101, 'Recevoir mail de fermeture boite', 'AUTH_SEND_CLOSE_BOX_MAIL'),
  (102, 'Recevoir mail de Bordereau', 'AUTH_SEND_BORDEREAU_MAIL'),
  (103, 'Base de données référentielle liste', 'AUTH_REFERENTIAL_DATABASE_READ'),
  (104, 'Base de données référentielle création', 'AUTH_REFERENTIAL_DATABASE_CREATE'),
  (105, 'Base de données référentielle mise à jour', 'AUTH_REFERENTIAL_DATABASE_UPDATE'),
  (106, 'Base de données référentielle suppression', 'AUTH_REFERENTIAL_DATABASE_DELETE'),
  (107, 'Filtre client globale', 'AUTH_CLIENT_FILTRE'),
  (108, 'Groupes des champs liste', 'AUTH_FIELD_GROUP_READ'),
  (109, 'Groupe des champs création', 'AUTH_FIELD_GROUP_CREATE'),
  (110, 'Groupe des champs mise à jour', 'AUTH_FIELD_GROUP_UPDATE'),
  (111, 'Groupe des champs suppression', 'AUTH_FIELD_GROUP_DELETE'),
  (112, 'Modèle de livrable liste', 'AUTH_DELIVERY_DOCUMENT_READ'),
  (113, 'Modèle de livrable création', 'AUTH_DELIVERY_DOCUMENT_CREATE'),
  (114, 'Modèle de livrable mise à jour', 'AUTH_DELIVERY_DOCUMENT_UPDATE'),
  (115, 'Modèle de livrable suppression', 'AUTH_DELIVERY_DOCUMENT_DELETE'),
  (116, 'Champ livrable liste', 'AUTH_DELIVERY_FIELD_READ'),
  (117, 'Champ livrable création', 'AUTH_DELIVERY_FIELD_CREATE'),
  (118, 'Champ livrable mise à jour', 'AUTH_DELIVERY_FIELD_UPDATE'),
  (119, 'Champ livrable suppression', 'AUTH_DELIVERY_FIELD_DELETE'),
  (120, 'Champs métier liste', 'AUTH_SETTING_DJIN_FIELD_READ'),
  (121, 'Champs métier mise à jour', 'AUTH_SETTING_DJIN_FIELD_UPDATE');


INSERT INTO `tj_user_role` VALUES (1, 2), (2, 1), (3, 3);
INSERT INTO `tj_auth_role`
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7), (1, 8), (1, 9), (1, 10), (1, 11), (1, 12), (1, 18),
  (1, 19), (1, 20), (1, 21), (1, 22), (1, 23), (1, 24), (1, 25), (1, 26), (1, 27), (1, 28), (1, 29), (1, 30), (1, 31),
  (1, 32), (1, 33), (1, 34), (1, 35), (1, 36), (1, 37), (1, 38), (1, 39), (1, 40), (1, 41), (1, 42), (1, 43), (1, 44),
  (1, 45), (1, 46), (1, 47), (1, 48), (1, 49), (1, 50), (1, 51), (1, 52), (1, 53), (1, 54), (1, 55), (1, 56), (1, 57),
  (1, 58), (1, 59), (1, 60), (1, 61), (1, 62), (1, 63), (1, 64), (1, 65), (1, 66), (1, 67), (1, 68), (1, 69), (1, 70),
  (1, 71), (1, 72), (1, 73), (1, 74), (1, 75), (1, 76), (1, 77), (1, 78), (1, 79), (1, 80), (1, 81), (1, 82), (1, 83),
  (1, 84), (1, 85), (1, 86), (1, 87), (1, 92), (1, 93), (1, 94), (1, 95), (1, 96), (1, 97), (1, 98), (1, 99), (1, 100),
  (1, 101), (1, 102), (1, 103), (1, 104), (1, 105), (1, 106), (1, 107), (1, 108), (1, 109), (1, 110), (1, 111),
  (1, 112), (1, 113), (1, 114), (1, 115), (1, 116), (1, 117), (1, 118), (1, 119), (1, 120), (1, 121), (2, 1), (2, 2),
  (2, 3), (2, 4), (2, 5), (2, 6), (2, 7), (2, 8), (2, 9), (2, 10), (2, 11), (2, 12), (2, 18), (2, 19), (2, 20), (2, 21),
  (2, 22), (2, 23), (2, 24), (2, 25), (2, 26), (2, 27), (2, 28), (2, 29), (2, 30), (2, 31), (2, 32), (2, 33), (2, 34),
  (2, 35), (2, 36), (2, 37), (2, 38), (2, 39), (2, 40), (2, 41), (2, 42), (2, 43), (2, 44), (2, 45), (2, 46), (2, 47),
  (2, 48), (2, 49), (2, 50), (2, 51), (2, 52), (2, 53), (2, 54), (2, 55), (2, 56), (2, 57), (2, 58), (2, 59), (2, 60),
  (2, 61), (2, 62), (2, 63), (2, 64), (2, 65), (2, 66), (2, 67), (2, 68), (2, 69), (2, 70), (2, 71), (2, 72), (2, 73),
  (2, 74), (2, 75), (2, 77), (2, 78), (2, 79), (2, 80), (2, 81), (2, 82), (2, 83), (2, 84), (2, 85), (2, 86), (2, 87),
  (2, 92), (2, 93), (2, 94), (2, 95), (2, 96), (2, 97), (2, 98), (2, 99), (2, 100), (2, 101), (2, 102), (2, 103),
  (2, 104), (2, 105), (2, 106), (2, 107), (2, 108), (2, 109), (2, 110), (2, 111), (2, 112), (2, 113), (2, 114),
  (2, 115), (2, 116), (2, 117), (2, 118), (2, 119), (2, 120), (2, 121);


/*------------------------Insert oauth data----------------------------------------------------------------------------*/
INSERT INTO OAUTH_CLIENT_DETAILS (CLIENT_ID, RESOURCE_IDS, CLIENT_SECRET, SCOPE, AUTHORIZED_GRANT_TYPES, AUTHORITIES, ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY)
VALUES ('spring-security-oauth2-read-client', 'resource-server-rest-api',
        /*spring-security-oauth2-read-client-password1234*/
        '$2a$04$WGq2P9egiOYoOFemBRfsiO9qTcyJtNRnPKNBl5tokP7IP.eZn93km',
        'read', 'password,authorization_code,refresh_token,implicit', 'USER', 10800, 2592000);
INSERT INTO OAUTH_CLIENT_DETAILS (CLIENT_ID, RESOURCE_IDS, CLIENT_SECRET, SCOPE, AUTHORIZED_GRANT_TYPES, AUTHORITIES, ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY)
VALUES ('spring-security-oauth2-read-write-client', 'resource-server-rest-api',
        /*spring-security-oauth2-read-write-client-password1234*/
        '$2a$04$soeOR.QFmClXeFIrhJVLWOQxfHjsJLSpWrU1iGxcMGdu.a5hvfY4W',
        'read,write', 'password,authorization_code,refresh_token,implicit', 'USER', 10800, 2592000);