begin
insert into t_claim_relativity (LIST_ID, NAME, DATA_TYPE, OPERATOR, CALC_FUNC)
values (62, 'Base Units', 1, '=', 'PKG_LS_CLM_ACCUMU_BLIL.P_RELATIVITY_CALC_BASE_UNITS');
commit;
END;
/
