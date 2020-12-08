DECLARE
  v_seq_page_access_role   T_PAGEACCESS_AUTHORITIES.PAGEACCESS_ROLE_ID%TYPE;
  v_seq_page_access_master T_PAGEACCESS_MASTER.PAGEACCESS_ID%TYPE;
begin
  --select seq_page_access_role.nextval into v_seq_page_access_role from dual;
  
  select seq_page_access_master.nextval
    into v_seq_page_access_master
    from dual;
  --PAGEACCESS MASTER
  insert into t_pageaccess_master
  values
    (v_seq_page_access_master, --pageaccess_id
     'DDSB', --screen_code
     'Debit File For Stanbic', --screen_desc
     '/pages/paypoint/transaction/gendebitforstanbic.zul', --url
     5, --module_id
     sysdate, --creation_date
     'bliladmin', --created_by
     sysdate, --modified_time
     'bliladmin', --modified_by
     'debit file generattion for stanbic bank', --comments
     'DEBIT FILE GENERATION', --attribute1
     NULL, --att2
     null, --att3
     null, --att4
     null, --att5
     null, --attr6
     1); --enabled

  --PAGEACEES_AUTHORITIES
  insert into t_pageaccess_authorities
  values
    ('ROLE_ADM_CASHOFFICE',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);

  insert into t_pageaccess_authorities
  values
    ('ROLE_ADM_PAYPOINT',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);

  insert into t_pageaccess_authorities
  values
    ('ROLE_ADMIN',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);

  insert into t_pageaccess_authorities
  values
    ('ROLE_CASHIER',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);

  insert into t_pageaccess_authorities
  values
    ('ROLE_PP_USER',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);

  insert into t_pageaccess_authorities
  values
    ('ROLE_SR_CASHIER',
     1,
     SYSDATE,
     'ADMIN',
     SYSDATE,
     'ADMIN',
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     NULL,
     v_seq_page_access_master,
     seq_page_access_role.nextval);
END;
/