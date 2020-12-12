insert into author(id,fname,lname) values(1,'glenn','opdycke');
insert into message(id,title,text,date_created,author_id)
    values(1,'first message','message from yesterday',current_date(),1);
insert into message(id,title,text,date_created,author_id)
    values(2,'second message','message from today',current_date(),1);
insert into message(id,title,date_created,author_id,text)
    values(3,'long message',current_date(),1,
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.'
    );