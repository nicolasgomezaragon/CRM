type Client struct {
	ID int `json:"id"`
	Name string `json:"name"`
	Email string `json:"email"`
	Phone int `json:"phone"`
	CompanyID: int `json:"company_id"`
}

// Addresses

type Address struct {
	Street string `json:"street"`
	City string `json:"city"`
	State string `json:"state"`
	PostalCode string `json:"postal_code"` 
}

type Company struct {
	ID int `json:"id"`
	Name string `json:"name"`
	CSM string `json:"csm"`
	Addresses []Address `json:"addresses"`
}

type Agent struct {
	ID int `json:"id"`
	Name string `json:""`
	Email string `json:""`
	DepartmentID int `json:"department_id"` 
}

type Department struct {
	ID int `json:"id"`
	Name string `json:"name"`
}