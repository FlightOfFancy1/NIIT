create table newcustomer(

	cuid IDENTITY,
	cufname varchar(50),
	culname varchar(50),
	cuemail varchar(50),
	cuaddress varchar(150),
	cupassword varchar(50),
	cumob int(10),
	
	CONSTRAINT pk PRIMARY KEY(cuid)
	

);