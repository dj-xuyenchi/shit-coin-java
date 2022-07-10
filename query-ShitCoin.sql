﻿CREATE DATABASE NAPAS
---------------
USE NAPAS
GO
---------------
DROP TABLE TRANSACTIONDETAIL
DROP TABLE CUSTOMERBANK
DROP TABLE CUSTOMER
DROP TABLE BANK
---------------
CREATE TABLE BANK
(
BANKID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
BANKNAME NVARCHAR(50) NULL,
BANKNICKNAM VARCHAR(10) NULL
)
--------------
CREATE TABLE CUSTOMER
(
CUSTOMERID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
CUSTOMERNAME NVARCHAR(50) NULL
)
---------------
CREATE TABLE CUSTOMERBANK
(
CUSTOMERBANKID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
CUSTOMERID UNIQUEIDENTIFIER NOT NULL,
BANKID UNIQUEIDENTIFIER NOT NULL,
USERNAME VARCHAR(50) NOT NULL,
BANKACCOUNTID VARCHAR(50) NOT NULL,
WALLET INT DEFAULT 0
)
-------------
CREATE TABLE TRANSACTIONDETAIL
(
TRANSACTIONDETAILID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
SENDERID UNIQUEIDENTIFIER NOT NULL FOREIGN KEY REFERENCES CUSTOMERBANK(CUSTOMERBANKID),
RECEIVERID UNIQUEIDENTIFIER NOT NULL FOREIGN KEY REFERENCES CUSTOMERBANK(CUSTOMERBANKID),
TRANSACTIONVALUE INT DEFAULT 0,
TRANSACTIONNOTIFITION VARCHAR(50) DEFAULT '',
TRANSACTIONDATE DATE DEFAULT GETDATE()
)

--------------
SELECT * FROM dbo.BANK
GO
INSERT INTO dbo.BANK
VALUES
('1A4116B9-98A6-48BF-837E-4217960C42F7',N'Kỹ Thương','TCB'),
('5352A3E3-F5CF-4E85-9630-A1688FC0EEC3',N'Nông Nghiệp','AGB'),
('FFFA919C-786E-4771-B4E2-A7A5BBC33D0D',N'Công Thương','VCB'),
('0997081E-042F-48C3-BA92-AE687EC5F771',N'Quân Đội','MB'),
('B3DD36F8-7A46-404A-8F76-DA08B17CC1E8',N'Á Châu','ACB')
--------------
SELECT * FROM dbo.CUSTOMER
GO
INSERT INTO dbo.CUSTOMER
VALUES
('D0D598C7-BED0-4FBD-92F3-73BFC1C65309','Đỗ Quang Anh'),
('FAA2EBB3-55E3-4F47-9B93-74B0DED7C95E','Đỗ Minh Anh'),
('CCD59144-F0D5-4D52-AF26-E678ED2D23D8','Đỗ Ngọc Anh'),
('85974C73-81F2-490E-93F8-ED7D402E5561','Đỗ Hải Anh'),
('CA23A378-F246-4F85-99F9-F9A0C469DCE5','Đỗ Thùy Anh')
---------------
SELECT * FROM dbo.CUSTOMERBANK
GO
INSERT INTO dbo.CUSTOMERBANK
VALUES
('A27F0991-E183-4FD9-85EF-04F4D3996F7D','D0D598C7-BED0-4FBD-92F3-73BFC1C65309','1A4116B9-98A6-48BF-837E-4217960C42F7','DO QUANG ANH','1908456232',23000000),
('36CEFC72-84B6-4D1C-95D7-50D055A0C3CE','FAA2EBB3-55E3-4F47-9B93-74B0DED7C95E','5352A3E3-F5CF-4E85-9630-A1688FC0EEC3','DO MINH ANH','1231236232',1203000),
('8E8644C1-7786-4CE3-8624-851F98F5C1B7','CCD59144-F0D5-4D52-AF26-E678ED2D23D8','FFFA919C-786E-4771-B4E2-A7A5BBC33D0D','DO NGOC ANH','434248456232',22650000),
('DDEC22DF-4051-4231-8F3D-A19A6746ADD4','85974C73-81F2-490E-93F8-ED7D402E5561','0997081E-042F-48C3-BA92-AE687EC5F771','DO HAI ANH','6563456232',23543000),
('9BC58DD9-A054-4D99-811A-C0A2733DAF0F','CA23A378-F246-4F85-99F9-F9A0C469DCE5','B3DD36F8-7A46-404A-8F76-DA08B17CC1E8','DO THUY ANH','134556232',7564000)
----------------

GO
ALTER PROC CREATETRANSACTION(@SENDERID UNIQUEIDENTIFIER,@RECEIVERID UNIQUEIDENTIFIER,@VALUE INT,@NOTIFITION VARCHAR(50))
AS
BEGIN
BEGIN TRANSACTION
UPDATE DBO.CUSTOMERBANK
SET WALLET -= @VALUE
WHERE CUSTOMERBANKID =@SENDERID
IF (SELECT DBO.CUSTOMERBANK.WALLET FROM DBO.CUSTOMERBANK WHERE CUSTOMERBANKID =@SENDERID)<0
BEGIN
PRINT 'SO DU KO DU'
ROLLBACK TRANSACTION
RETURN
END
UPDATE DBO.CUSTOMERBANK
SET WALLET += @VALUE
WHERE CUSTOMERBANKID = @RECEIVERID
INSERT INTO DBO.TRANSACTIONDETAIL
VALUES
(DEFAULT,@SENDERID,@RECEIVERID,@VALUE,@NOTIFITION,DEFAULT)
COMMIT TRANSACTION
END 
-----------------------------------

--insert data
EXEC dbo.CREATEtransaction @senderid = '36CEFC72-84B6-4D1C-95D7-50D055A0C3CE',   
                           @receiverid = '8E8644C1-7786-4CE3-8624-851F98F5C1B7', 
                           @value = 1435,          
						   @notifition ='hihi'

