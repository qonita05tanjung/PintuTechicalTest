describe('API Test', function(){

    it('Get Request', function(){
        cy.request('GET', 'https://jsonplaceholder.typicode.com/posts')
        .then((response) => {
            expect(response.status).to.eq(200)
                for (let i=0; i < response.body.length; i++)
                {
                    expect(response.body[i]).to.have.property('userId')
                    expect(response.body[i]).to.have.property('id')
                    expect(response.body[i]).to.have.property('title')
                    expect(response.body[i]).to.have.property('body')
                    expect(response.body[i]).property('userId').to.be.a('number')
                    expect(response.body[i]).property('id').to.be.a('number')
                    expect(response.body[i]).property('title').to.be.a('string')
                    expect(response.body[i]).property('body').to.be.a('string')
                }
                
        });

    });

    it('Post Request', function(){
        cy.request({
            method: 'POST', 
            url: 'https://jsonplaceholder.typicode.com/posts',
            header: {
                'content-type' : 'application/json'
            },
            body: {
                    "title": "recommendation",
                    "body": "motorcycle",
                    "userId": 12
            }
        }).then((response=>{
            expect(response.status).to.eq(201);     
    }));

});

});